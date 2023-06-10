
function Validator(options) {
	var formElement = document.querySelector(options.form);

	function validator(inputElement, rule) {
		var errorMessage = rule.test(inputElement.value);
		
		var errorElement = inputElement.parentElement.parentElement.querySelector('.form-message');
		if (errorMessage) {
			errorElement.innerText = errorMessage;
			inputElement.parentElement.parentElement.classList.add('invalid');
			if(inputElement.previousElementSibling != null){
				inputElement.previousElementSibling.classList.add('error_box');
			}

		} else {
			errorElement.innerText = '';
			inputElement.parentElement.parentElement.classList.remove('invalid');
			inputElement.previousElementSibling.classList.remove('error_box');
		}
	}
	

	if (formElement) {
		options.rules.forEach(function(rule) {
			var inputElement = formElement.querySelector(rule.selector);

			if (inputElement) {
				inputElement.onblur = function() {
					validator(inputElement, rule);
				}
				inputElement.oninput = function() {
						var errorElement = inputElement.parentElement.parentElement.querySelector('.form-message');
						errorElement.innerText = '';
						inputElement.parentElement.parentElement.classList.remove('invalid');
						inputElement.previousElementSibling.classList.remove('error_box');
					}
				}
			
		});
	}
}

Validator.isUsername = function(selector,  message) {
	return {
		selector: selector,
		test: function(value) {
			return value ? undefined :  message;
		}
	};
}

Validator.isBirthday = function(selector,  message) {
	return {
		selector: selector,
		test: function(value) {
			return value.trim().length > 0 ? undefined : message;
		}
	};
}

Validator.isAccount = function(selector, message) {
	return {
		selector: selector,
		test: function(value) {
			if (value.indexOf(' ') > 0) return 'Tài khoản không được chứa khoảng trắng !';
			return value ? undefined :  message;
		}
	};
}

Validator.isPassword = function(selector, message) {
	return {
		selector: selector,
		test: function(value) {
			if (value.indexOf(' ') >= 0) return 'Mật khẩu không được chứa khoảng trắng !';
			return value.length > 6 ? undefined : message;
		}
	};
}

Validator.isRepassword = function(selector, getConfirmValue, message) {
	return {
		selector: selector,
		test: function(value) {
			if (value.trim().length === 0) return 'Vui lòng nhập trường này';
			return value === getConfirmValue() ? undefined : message;
		}
	};
}

Validator.isPhone = function(selector, message) {
	return {
		selector: selector,
		test: function(value) {
			var regex = /((09|03|07|08|05)+([0-9]{8})\b)/g;
			if (value.trim().length === 0) return 'Vui lòng điền số điện thoại';
			return regex.test(value) ? undefined : message;
		}
	};
}

Validator.isAdress = function(selector, message) {
	return {
		selector: selector,
		test: function(value) {
			return value ? undefined : message;
		}
	};
}

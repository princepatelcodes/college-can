const validate = new window.JustValidate('#form');

validate
    .addField('#email', [
        {
            rule: 'required',
            errorMessage: 'Email is required',
        },
        {
            rule: 'email',
            errorMessage: 'Email is invalid!',
        },
    ])
    .addField('#pass', [
        {
            rule: 'required',
            errorMessage: 'Password is required',
        },
        {
            rule: 'minLength',
            value: 6,
        },
        {
            rule: 'maxLength',
            value: 12,
        },
    ]);
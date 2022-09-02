## Vanilla JS Form Validation


This is a Better version of this using [`just-validate`](https://github.com/horprogs/Just-validate), a dependency free version is also available [here](..\plain_js_form_validation).

It Also supports Bootstrap by default.

## Steps

1. Create a html form.
2. Add an id of form to it.
3. import just-validate using CDN.
4. Initliaze

```js
const validate = new window.JustValidate('#form');
```

5. Add Fields and Validation

```js
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
```
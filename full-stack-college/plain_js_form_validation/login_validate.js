function validate() {
    var myForm = document.forms['myform'];

    var email = myForm['email'].value;
    if (email == "") {
        alert("Please Enter Email !");
        return false;
    }
    var pass = myForm['pass'].value;
    if (pass == "") {
        alert("Please Enter Password !");
        return false;
    }
}
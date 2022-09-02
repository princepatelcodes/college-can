function validate() {
    var myForm = document.forms['myform'];
    var name = myForm['name'].value;
    if (name == "") {
        alert("Please Enter Name !");
        return false;
    }
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
    var gender = myForm['gender'].value;
    if (gender == "") {
        alert("Please Select Your Gender !");
        return false;
    }
}
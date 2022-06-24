/**
 * 
 */
 
$('document').ready(function(){
var password= document.getElementById("password")
var cpassword = document.getElementById ("cpassword");
function validatePassword(){
if (password.value != cpassword.value) {
cpassword.setCustomValidity("Passwords Don't Match") ;
} else {
cpassword.setCustomValidity('');
}
}

password.onchange=validatePassword;
cpassword.onkeyup=validatePassword;
});


function handleSubmit () {
    const fnames = document.getElementById('fname').value;
    const lnames = document.getElementById('lname').value;

    // to set into local storage
    /* localStorage.setItem("NAME", name);
    localStorage.setItem("SURNAME", surname); */
    
    sessionStorage.setItem("NAME", fnames);
    sessionStorage.setItem("SURNAME", lnames);

    return "/student/profile.html";
}

window.addEventListener('load', () => {

    // Via Query parameters - GET
    /* const params = (new URL(document.location)).searchParams;
    const name = params.get('name');
    const surname = params.get('surname'); */

    // Via local Storage
    /* const name = localStorage.getItem('NAME');
    const surname = localStorage.getItem('SURNAME'); */
    
    const fnames = sessionStorage.getItem('NAME');
    const lnames = sessionStorage.getItem('SURNAME');
    
    document.getElementById('result-fname').innerHTML = fnames;
    document.getElementById('result-lname').innerHTML = lnames;

})
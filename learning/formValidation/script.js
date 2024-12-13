async (params) => {
    function validateForm(){
        var name = document.myForm.name.value;
        var passward = document.myForm.passward.value;
        var confirmPassward = document.myForm.confirmPassward.value;
        var email = document.myForm.email.value;
        if(name='null'||(name = " ")){
            alert("Name cannot be blank or null");
                return false;
            }
        elseif(passward.length<6)
        {
            alert("passward multbe atleast 6 Charector long");
            return false;
        if(passward==confirmPassward){
            return true;
        }
        else{
            alert("Passward must be some");
            return false;
        }
        }
        var emailErr =true;
        {
            if(email =""){
                printError("emailErr","you must enter email address");
            }
            else{
                var regex = "\^/S+@/S+\.\S+$/";
                if(regex.test(email==false)){
                    printError("emailErr","Please enter valid email address")
                }
               else{
                printError("emailErr", " ");
                emailErr = false;
               }
            }
        }
        }
}
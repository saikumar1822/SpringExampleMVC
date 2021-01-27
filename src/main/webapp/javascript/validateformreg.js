

function validateform(){  
	/*var userid=document.myform.userid.value;*/
	var username=document.myform.username.value;  
	var password=document.myform.password.value;
	var firstname=document.myform.firstname.value;
	var lastname=document.myform.lastname.value;
	var email=document.myform.email.value;
	var address=document.myform.address.value;
	var phone=document.myform.phone.value;
	  
	if (username==""){  
	  alert("userName can't be blank"); 
	
	  return false;  
	}
	else if(password.length<6){  
	  alert("Password must be at least 6 characters long.");  
	
	  return false;  
	  }  
	else if (firstname== "") { 
         window.alert("Please enter your name."); 
      
         return false; 
     } 
 
	else if (lastname== "") { 
         window.alert("Please enter your name.");  
         return false; 
     } 

   else if (address == "") { 
         window.alert("Please enter your address."); 
         
         return false; 
     } 

   else  if (email == "") { 
         window.alert( 
           "Please enter a valid e-mail address."); 
        
         return false; 
     } 

   else  if (phone == "") { 
         window.alert( 
           "Please enter your telephone number."); 
        
         return false; 
     } 
    

	} 



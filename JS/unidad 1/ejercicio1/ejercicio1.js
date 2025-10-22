let x =prompt("escribe un numero");
let divisores=0;
for(i=2;i<=x;i++){
    if(x%i==0){
        divisores++;
    }if(divisores<=2){
            console.log("el numero" + x +"no es primo");
        }else{
            console.log("el numero" + x +"es primo");
        }
    }

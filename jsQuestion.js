// Online Javascript Editor for free
// Write, Edit and Run your Javascript code using JS Online Compiler

//return oddish
oddishOrEvenish(43);

//return oddish
oddishOrEvenish(373);

//return evenish
oddishOrEvenish(4433);

function oddishOrEvenish(number){
    
    var value = number;
    var sum = 0;
    
    while(value > 0){
        
        sum+= value % 10;
        value = Math.floor(value/10);
        
    }//end while

    if(sum%2==1){
        console.log("Oddish");
    }else{
        console.log("Evenish");
    }
    
}//end oddishOrEvenish
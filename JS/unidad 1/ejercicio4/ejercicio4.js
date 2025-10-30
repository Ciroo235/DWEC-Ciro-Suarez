const trapecio= {
    base1:12,
    base2:14,
    altura1:8,
    calcularArea:function(){
        return(this.base1+this.base2)*this.altura1/2;
    }
}
const rombo= {
    lado:12,
    diagonal2:14,
    diagonal1:8,
    calcularArea:function(){
        return(this.diagonal1 * this.diagonal2)/2;
    }
}
console.log(rombo.calcularArea());
console.log(trapecio.calcularArea());
    var notas = [];
    var aprobado = [];
    var mayor = 0;
    var menor = 10;
    var suma = 0;

    for (let i = 0; i < 10; i++) {
        notas.push((Math.random() * 10).toFixed(2));
        let n = parseFloat(notas[i]);
        suma += n;

        if (n > mayor) mayor = n;
        if (n < menor) menor = n;

        if (n >= 5 && n < 6) {
            aprobado.push("APROBADO");
        } else if (n >= 6 && n < 7) {
            aprobado.push("BIEN");
        } else if (n >= 7 && n < 9) {
            aprobado.push("NOTABLE");
        } else if (n >= 9 && n <= 10) {
            aprobado.push("SOBRESALIENTE");
        }
    }
    var media = suma / notas.length;
    console.log("Notas:", notas);
    console.log("Media de la clase:", media.toFixed(2));
    console.log("Categorías de aprobados:", aprobado);
    console.log("La mayor nota es:", mayor);
    console.log("La menor nota es:", menor);

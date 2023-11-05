document.addEventListener("DOMContentLoaded", function () {
    const primeForm = document.getElementById("primeForm");
    const startInput = document.getElementById("start");
    const endInput = document.getElementById("end");
    const primeList = document.getElementById("primeList");

    primeForm.addEventListener("submit", function (e) {
        e.preventDefault();
        primeList.innerHTML = "";
        const start = parseInt(startInput.value);
        const end = parseInt(endInput.value);
        if (start > end) {
            alert("El valor 'Desde' debe ser menor o igual al valor 'Hasta'");
            return;
        }

        for (let number = start; number <= end; number++) {
            if (isPrime(number)) {
                const listItem = document.createElement("li");
                listItem.textContent = number;
                primeList.appendChild(listItem);
            }
        }
    });

    function isPrime(num) {
        if (num <= 1) return false;
        if (num <= 3) return true;
        if (num % 2 === 0 || num % 3 === 0) return false;
        let i = 5;
        while (i * i <= num) {
            if (num % i === 0 || num % (i + 2) === 0) return false;
            i += 6;
        }
        return true;
    }
});

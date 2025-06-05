function myFunction() {
        document.getElementById("myDropdown").classList.toggle("show");
    }
    window.onclick = function (event) {
        if (!event.target.matches('.dropbtn')) {
            var dropdowns = document.getElementsByClassName("dropdown-content");
            var i;
            for (i = 0; i < dropdowns.length; i++) {
                var openDrp = dropdowns[i];
                if (openDrp.classList.contains('show')) {
                    openDrp.classList.remove('show');
                }
            }
        }
    }

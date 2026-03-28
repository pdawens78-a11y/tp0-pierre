function copyToClipboard(id) {
    let element = document.getElementById(id);

    if (element) {
        element.select();
        element.setSelectionRange(0, 99999);

        navigator.clipboard.writeText(element.value)
            .then(() => console.log("Copié"))
            .catch(err => console.error("Erreur copie :", err));
    }
}

function toutEffacer() {
    let question = document.getElementById("form:question");
    let reponse = document.getElementById("form:reponse");

    if (question) question.value = "";
    if (reponse) reponse.value = "";
}
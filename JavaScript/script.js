function aparecer(elemento, aparecedor) {
    const cadenaTransformar = "desaparecer(" + "'" + elemento + "'" + "," + "'" + aparecedor + "')";
    const textoAparecedor = document.getElementById(aparecedor).textContent;
    document.getElementById(aparecedor).textContent = textoAparecedor.replace('[+]', '[-]');
    document.getElementById(elemento).style.display = "block";
    document.getElementById(aparecedor).setAttribute('onclick', cadenaTransformar);
}

function desaparecer(elemento, aparecedor) {
    const cadenaTransformar = "aparecer(" + "'" + elemento + "'" + "," + "'" + aparecedor + "')";
    const textoAparecedor = document.getElementById(aparecedor).textContent;
    document.getElementById(aparecedor).textContent = textoAparecedor.replace('[-]', '[+]');
    document.getElementById(elemento).style.display = "none";
    document.getElementById(aparecedor).setAttribute('onclick', cadenaTransformar);
}
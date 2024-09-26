function mostrarResposta(id) {
    const respostaDiv = document.querySelector(`.pergunta[data-id='${id}'] .resposta`);
    respostaDiv.style.display = respostaDiv.style.display === 'none' ? 'block' : 'none';
}

function classificar(id, nota) {
    const resultadoSpan = document.querySelector(`.pergunta[data-id='${id}'] .resultado`);
    resultadoSpan.textContent = `Você classificou esta pergunta com ${nota} estrelas!`;
}

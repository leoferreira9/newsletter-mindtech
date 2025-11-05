document.addEventListener("DOMContentLoaded", () => {
  const form = document.getElementById("subscribeForm");

  form.addEventListener("submit", async (event) => {
    event.preventDefault(); // impede o comportamento padrão do form

    const emailInput = document.getElementById("email");
    const email = emailInput.value.trim();

    if (!email) {
      alert("Por favor, insira um e-mail válido.");
      return;
    }

    try {
      const response = await fetch("/subscribe", {
        method: "POST",
        headers: {
          "Content-Type": "application/json",
        },
        body: JSON.stringify({ email }),
      });

      if (response.ok) {
        // redireciona para a tela de agradecimento
        window.location.href = "thankyou.html";
      } else if (response.status === 409) {
        alert("Este e-mail já está cadastrado.");
      } else {
        alert("Erro ao se inscrever. Tente novamente.");
      }
    } catch (error) {
      console.error("Erro:", error);
      alert("Não foi possível conectar ao servidor.");
    }
  });
});

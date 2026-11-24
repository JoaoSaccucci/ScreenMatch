# 🎬 Projeto Screen Match

Este é um projeto desenvolvido em Java que simula um catálogo de filmes e séries, consumindo dados reais de uma API.

### 🛠️ O que eu usei:
* **Java:** Linguagem principal (JDK 17).
* **Gson:** Para processar os dados dos filmes (JSON).
* **OMDb API:** Fonte das informações dos filmes.

### 🔑 Chave da API
A busca usa a OMDb API, que precisa de uma chave. A chave não fica no código: o programa lê a variável de ambiente `OMDB_API_KEY`.

1. Peça uma chave grátis em [omdbapi.com/apikey.aspx](https://www.omdbapi.com/apikey.aspx).
2. Defina a variável antes de rodar:
   * Windows (PowerShell): `$env:OMDB_API_KEY = "sua-chave"`
   * Linux/macOS: `export OMDB_API_KEY=sua-chave`
   * IntelliJ: *Run > Edit Configurations > Environment variables*.

### 🚀 Como rodar:
1. Clone este repositório.
2. Abra no IntelliJ ou VS Code.
3. Defina a `OMDB_API_KEY` (veja acima).
4. Execute a classe `PrincipalComBusca` para buscar filmes.

---
Desenvolvido por **Joao Saccucci** 🚀

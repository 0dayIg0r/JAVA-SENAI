// 01 criar a váriavel
xhttp = new XMLHttpRequest()
var lista
var api = 'https://igormedeiros.herokuapp.com/api/product/'

function listar() {
    // 02 definição do nosso request (forma e endereço)
    xhttp.open('GET', api)
    // 03 manda de fato a request
    xhttp.send()
    // 04 execução quando tiver a devolutiva do request
    xhttp.onload = function () {
        lista = this.responseText
        // console.log(lista)
        lista = JSON.parse(lista)
        // console.log(lista)
        texto = ''
        i = 0
        for (const u of lista) {
            texto += `<tr onclick='editar(${i})'>
            <td class="text-center">${u.name}</td>
            <td class="text-center">${u.price}</td> 
            <td class="text-center">${u.description}</td>
            </tr>`
            i++
        }
        document.getElementById('lista').innerHTML = texto
    }
}

function editar(i) {
    p = lista[i]
    document.getElementById('nome').value = p.name
    document.getElementById('preço').value = p.price
    document.getElementById('descrição').value = p.description
}

function gravar() {

    var produto = {}
    produto.nome = document.getElementById('nome').value
    produto.price = document.getElementById('preço').value
    produto.description = document.getElementById('descrição').value
    // console.log(usuario)

    produto.id = document.getElementById('id').value
    if (produto.id > 0) {
        acao = 'PUT'
    } else {
        acao = 'POST'
    }

    xhttp.open(acao, api)
    xhttp.setRequestHeader('Content-Type', 'application/jsoncharset=UTF-8')
    xhttp.send(JSON.stringify(produto))
    xhttp.onload = function () {
        listar()
        limpar()
    }
}

function limpar() {
    document.getElementById('nome').value = ''
    document.getElementById('preço').value = ''
    document.getElementById('descrição').value = ''
}

function apagar() {
    id = document.getElementById('id').value
    xhttp.open('DELETE', api + id)
    xhttp.send()
    xhttp.onload = function () {
        alert(this.responseText)
        listar()
        limpar()
    }
}
listar()
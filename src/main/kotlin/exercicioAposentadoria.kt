package classes

class exercicioAposentadoria (var idade: Int, var sexo: String, var anosDeContribuicao: Int) {
    fun calculadoraAposentadoria(): Boolean {
        if (this.anosDeContribuicao >= 30) {
            if ((this.sexo == "feminino" && this.idade >= 60) || (this.sexo == "masculino" && this.idade >= 65))
                return true
        }
        return false
    }
}
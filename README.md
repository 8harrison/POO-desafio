# POO-desafio
[![](https://mermaid.ink/img/pako:eNplksFOwzAMhl8lymkIeIGKCxoXDqCJoZ16cRPTWaR25SQTrOzdybpuYyyn-LeT_7OTwTrxaCvrAsT4RNAqdDU_L9bCaB5-7u_NG_YqPifRlxzJQbhMP_agGNbyjgE_hMnJZf4VNtiCF33mhMqYjunK3HrJTUATnSLykrZYc80jybXrULMp65Y4mY2E3OEkNCIBgQ3FRYBv4nbSoZRwAl2NxbObSfbUEWf6LydxoKeohxz_hLH05kgYJpjZMmkxMt0YlardGfx6HsM_0DXEJbW8H-SoB2qL13QlFyiVozEkZI9nECr3EehcVJFkJdvZpfnVsM1wNaV5mb1L6KcEflFDuoCW-NRX1nAi8HTo_FU28NjA7IyWIdAWjkf3IPbOFvoOyJcfNTrXNq2xPJWtytaDftb2UAflaZff7GyVNOOdzb0vzU4f0FYfECLufgE-meiK?type=png)](https://mermaid.live/edit#pako:eNplksFOwzAMhl8lymkIeIGKCxoXDqCJoZ16cRPTWaR25SQTrOzdybpuYyyn-LeT_7OTwTrxaCvrAsT4RNAqdDU_L9bCaB5-7u_NG_YqPifRlxzJQbhMP_agGNbyjgE_hMnJZf4VNtiCF33mhMqYjunK3HrJTUATnSLykrZYc80jybXrULMp65Y4mY2E3OEkNCIBgQ3FRYBv4nbSoZRwAl2NxbObSfbUEWf6LydxoKeohxz_hLH05kgYJpjZMmkxMt0YlardGfx6HsM_0DXEJbW8H-SoB2qL13QlFyiVozEkZI9nECr3EehcVJFkJdvZpfnVsM1wNaV5mb1L6KcEflFDuoCW-NRX1nAi8HTo_FU28NjA7IyWIdAWjkf3IPbOFvoOyJcfNTrXNq2xPJWtytaDftb2UAflaZff7GyVNOOdzb0vzU4f0FYfECLufgE-meiK)




classDiagram
IPhone <|-- ReprodutorMusical
IPhone <|-- AparelhoTelefonico
IPhone <|-- NavegadorInternet
IPhone: +double screenSize

class ReprodutorMusical{
    +int volume
    +boolean isPlaying
    +aumentarVolume()
    +diminuirVolume()
    +tocar()
    +pausar()
    +selecionarMusica(String musica)
}

class AparelhoTelefonico{
    +boolean hasSignal
    +ligar(String numero)
    +atender()
    +iniciarCorreioVoz()
}

class NavegadorInternet {
    +boolean isConected
    +exibirPagina(String url)
    +adicionarNovaAba()
    +atualizarPagina()
}

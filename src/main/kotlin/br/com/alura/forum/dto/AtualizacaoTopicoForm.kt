package br.com.alura.forum.dto

import jakarta.validation.constraints.NotEmpty
import org.jetbrains.annotations.NotNull

class AtualizacaoTopicoForm(

    @field:NotNull
    val id: Long,
    @field:NotEmpty
    val titulo: String,
    @field:NotEmpty
    val mensagem: String
)
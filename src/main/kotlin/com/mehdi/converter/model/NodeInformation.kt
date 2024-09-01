package com.mehdi.converter.model

import java.time.format.DateTimeFormatter
import java.time.LocalDate

data class NodeInformation (val version: String, val date: String?) {

    val simpleFormater = DateTimeFormatter.ofPattern("dd/MM/yyyy")
    val extendedFormater = DateTimeFormatter.ofPattern("dd MMMM yyyy")

    var description: String
    get() = if (date?.isNotEmpty() == true) {
        "Release $version on ${LocalDate.parse(date, simpleFormater).format(extendedFormater)}"
    } else "Release $version"
    set(_) = TODO()
    
}
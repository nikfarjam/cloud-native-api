package com.mehdi.converter.model

data class NodeInformation (val version: String, val date: String?) {
    var description: String
    get() = if (date?.isNotEmpty() == true) {
        "Release $version on $date"
    } else "Release $version"
    set(value) = TODO()
    
}
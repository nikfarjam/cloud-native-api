package com.mehdi.converter.service

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service

@Service
class AboutService
constructor(
        @Value("\${app-version:unknown}") val appVersion: String,
        @Value("\${app-release-date:unknown}") val appReleaseDate: String
)


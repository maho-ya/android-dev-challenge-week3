/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val LightColorPalette = lightColors(
    primary = pink100,
    secondary = pink900,
    background = white,
    surface = white850,
    onPrimary = gray,
    onSecondary = white,
    onBackground = gray,
    onSurface = gray
)

private val DarkColorPalette = darkColors(
    primary = green900,
    secondary = green300,
    background = gray,
    surface = white150,
    onPrimary = white,
    onSecondary = gray,
    onBackground = white,
    onSurface = white850
)

fun getMaterialColor(darkTheme: Boolean) =
    if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

fun getCardBackgroundColor(darkTheme: Boolean) =
    if (darkTheme) {
        darkGray
    } else {
        white
    }

fun getCheckBoxBackgroundColor(darkTheme: Boolean) =
    if (darkTheme) {
        darkCheckBox
    } else {
        lightCheckBox
    }

fun getCheckForeground(darkTheme: Boolean) =
    if (darkTheme) {
        darkCheckForeground
    } else {
        lightCheckForeground
    }

fun getShadowColor(darkTheme: Boolean) =
    if (darkTheme) {
        darkShadow
    } else {
        lightShadow
    }

@Composable
fun MyTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable() () -> Unit
) {
    val colors = getMaterialColor(darkTheme = darkTheme)

    MaterialTheme(
        colors = colors,
        typography = typography,
        shapes = shapes,
        content = content
    )
}

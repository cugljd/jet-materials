package com.yourcompany.android.jetnotes.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yourcompany.android.jetnotes.theme.green

@Composable
fun Note() {
  Box(modifier = Modifier
    .size(40.dp)
    .background(green))
}

@Preview
@Composable
private fun NotePreview() {
  Note()
}
package com.topic2.android.notes.ui.components.screens

import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import com.topic2.android.notes.viewmodel.MainViewModel

@Composable
fun SaveNoteScreen(viewModel: MainViewModel) {

}


@Composable
private fun SaveNoteTopAppBar(
    isEditingMode: Boolean,
    onBackClick: () -> Unit,
    onSaveNoteClick: () -> Unit,
    onOpenColorPickerClick: () -> Unit,
    onDeleteNoteClick: () -> Unit
) {
    
}
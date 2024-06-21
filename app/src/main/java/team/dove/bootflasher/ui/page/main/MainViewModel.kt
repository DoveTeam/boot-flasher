package team.dove.bootflasher.ui.page.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.getAndUpdate
import kotlinx.coroutines.launch
import team.dove.bootflasher.util.PartitionUtil

class MainViewModel : ViewModel() {
    private val _state: MutableStateFlow<State> = MutableStateFlow(State())
    val state: StateFlow<State> = _state

    fun loadAllPartition() {
        viewModelScope.launch {
            val partitionsList = PartitionUtil.getPartitionsList()
            _state.getAndUpdate {
                it.copy(partitions = partitionsList)
            }
        }
    }

    data class State(
        val partitions: List<String> = emptyList()
    )
}
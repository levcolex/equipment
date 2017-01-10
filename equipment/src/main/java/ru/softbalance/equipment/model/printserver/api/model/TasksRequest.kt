package ru.softbalance.equipment.model.printserver.api.model

import com.fasterxml.jackson.annotation.JsonProperty
import ru.softbalance.equipment.model.Task

class TasksRequest : SettingsRequest() {

    @JsonProperty("taskTable")
    var tasks = emptyList<Task>()

}

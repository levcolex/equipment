package ru.softbalance.equipment.model

import io.reactivex.Single

interface EcrDriver {

    fun execute(tasks: List<Task>, finishAfterExecute: Boolean): Single<EquipmentResponse>

    fun getSerial(finishAfterExecute: Boolean): Single<SerialResponse>

    fun getSessionState(finishAfterExecute: Boolean): Single<SessionStateResponse>

    fun openShift(finishAfterExecute: Boolean): Single<OpenShiftResponse>

    fun getOfdStatus(finishAfterExecute: Boolean): Single<OfdStatusResponse>

    fun finish()

    fun getTaxes(finishAfterExecute: Boolean): Single<List<Tax>>
}
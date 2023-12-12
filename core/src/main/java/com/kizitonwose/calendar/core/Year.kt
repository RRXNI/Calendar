package com.kizitonwose.calendar.core

import androidx.compose.runtime.Immutable
import java.io.Serializable

/**
 * Represents a year on the year-based calendar.
 */
@Immutable
data class Year(val value: java.time.Year) : Serializable {


}

package com.kizitonwose.calendar.data

import java.time.DayOfWeek
import java.time.LocalDate
import java.time.YearMonth
import java.time.temporal.WeekFields

fun checkDateRange(startMonth: YearMonth, endMonth: YearMonth) {
    check(endMonth >= startMonth) {
        "startMonth: $startMonth is greater than endMonth: $endMonth"
    }
}

fun checkDateRange(startDate: LocalDate, endDate: LocalDate) {
    check(endDate >= startDate) {
        "startDate: $startDate is greater than endDate: $endDate"
    }
}

fun LocalDate.weekOfMonth(firstDayOfWeek: DayOfWeek): Int {
    val weekFields = WeekFields.of(firstDayOfWeek, 1)
    return this.get(weekFields.weekOfMonth())
}

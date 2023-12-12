package com.kizitonwose.calendar.compose.yearcalendar

import androidx.compose.foundation.lazy.LazyListItemInfo
import androidx.compose.foundation.lazy.LazyListLayoutInfo
import com.kizitonwose.calendar.core.Year

/**
 * Contains useful information about the currently displayed layout state of the calendar.
 * For example you can get the list of currently displayed months.
 *
 * Use [YearCalendarState.layoutInfo] to retrieve this.
 *
 * @see LazyListLayoutInfo
 */
class YearCalendarLayoutInfo(
    info: LazyListLayoutInfo,
    private val getIndexData: (Int) -> Year,
) : LazyListLayoutInfo by info {

    /**
     * The list of [YearCalendarItemInfo] representing all the currently visible years.
     */
    val visibleYearsInfo: List<YearCalendarItemInfo>
        get() = visibleItemsInfo.map { info ->
            YearCalendarItemInfo(info, getIndexData(info.index))
        }
}

/**
 * Contains useful information about an individual year on the calendar.
 *
 * @param year The year in the list.

 * @see YearCalendarLayoutInfo
 * @see LazyListItemInfo
 */
class YearCalendarItemInfo(info: LazyListItemInfo, val year: Year) :
    LazyListItemInfo by info

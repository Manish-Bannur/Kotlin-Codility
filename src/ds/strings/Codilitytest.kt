package ds.strings

import java.util.Calendar
import java.util.GregorianCalendar
import java.time.temporal.ChronoUnit
import java.time.LocalDate
import java.time.Month

fun main(args: Array<String>) {
    println(Sample().solution(2014, "April","May","Wednesday"))
}

class Sample{
    fun solution(Y: Int, A: String, B: String, W: String): Int {
        val vacationStartMonth = (Month.valueOf(A.toUpperCase()).ordinal + 1).toShort()
        val vacationEndMonth = (Month.valueOf(B.toUpperCase()).ordinal + 1).toShort()

        val leapYear = Y % 4 == 0
        //checking if the year is a leap year
        val vacationLastDayDate = Month.valueOf(B.toUpperCase()).length(leapYear).toShort()
        //finding last day of vacation

        if (vacationStartMonth.toInt() == -1 || vacationEndMonth.toInt() == -1 || vacationLastDayDate.toInt() == -1) {
            println("invalid input")
            return -1
        }

        val startDate = LocalDate.of(Y, vacationStartMonth.toInt(), 1)
        val endDate = LocalDate.of(Y, vacationEndMonth.toInt(), vacationLastDayDate.toInt())
        val startingMondayDate: LocalDate

        if (startDate.dayOfWeek.toString() !== "MONDAY") {
            val daysTillMonday = 7 - startDate.dayOfWeek.ordinal
            //finding number of days to next monday
            startingMondayDate = startDate.plusDays(daysTillMonday.toLong())
        } else {
            startingMondayDate = startDate
        }
        //Finding the first monday of the vacation

        val noOfWeeks = ChronoUnit.WEEKS.between(startingMondayDate, endDate)
        //Finding the number of weeks of vacation
        return noOfWeeks.toInt()
    }
}

class Codilitytest {
    enum class MONTH {
        January,
        February,
        March,
        April,
        May,
        June,
        July,
        August,
        September,
        October,
        November,
        December
    }

    fun solution(Y: Int, A: String, B: String, W: String): Int {

        /*
		 *
		 * Y=2014 A="April" B ="May" W="Wednesday"
		 *
		 */
        var returnVal = 0

        var c1 = Calendar.getInstance()
        c1 = GregorianCalendar(Y, getOrdinalOfMonth(A), 1)

        var c2 = Calendar.getInstance()
        c2 = GregorianCalendar(Y, getOrdinalOfMonth(B), getTotalDayCountOfMonth(Y, 1 + getOrdinalOfMonth(B)))

        returnVal = 1 + c2.get(Calendar.WEEK_OF_YEAR) - c1.get(Calendar.WEEK_OF_YEAR)

        if (!isFirstDaySunday(Y, A)) {
            returnVal--
        }

        if (!isLastDayOfMonthSaturday(Y, B)) {
            returnVal--
        }
        return returnVal
    }


    fun isFirstDaySunday(year: Int, _month: String): Boolean {
        var c = Calendar.getInstance()
        c = GregorianCalendar(year, getOrdinalOfMonth(_month), 1)
        return c.get(Calendar.DAY_OF_WEEK) == 1
    }

    fun isLastDayOfMonthSaturday(year: Int, month_b: String): Boolean {
        var c = Calendar.getInstance()
        c = GregorianCalendar(
            year,
            getOrdinalOfMonth(month_b),
            getTotalDayCountOfMonth(year, 1 + getOrdinalOfMonth(month_b))
        )
        return c.get(Calendar.DAY_OF_WEEK) == 7
    }

    fun getTotalDayCountOfMonth(year: Int, monthIndex: Int): Int {
        var totalDayCountInThisMonth = 30
        when (monthIndex) {
            1 -> totalDayCountInThisMonth = 31
            2 -> {
                if (isLeapYear(year))
                    totalDayCountInThisMonth = 29
                else
                    totalDayCountInThisMonth = 28
            }
            3 -> totalDayCountInThisMonth = 31
            4 -> totalDayCountInThisMonth = 30
            5 -> totalDayCountInThisMonth = 31
            6 -> totalDayCountInThisMonth = 30
            7 -> totalDayCountInThisMonth = 31
            8 -> totalDayCountInThisMonth = 31
            9 -> totalDayCountInThisMonth = 30
            10 -> totalDayCountInThisMonth = 31
            11 -> totalDayCountInThisMonth = 30
            12 -> totalDayCountInThisMonth = 31

            else -> {
            }
        }


        return totalDayCountInThisMonth
    }

    fun isLeapYear(year: Int): Boolean {

        var isALeapYear = false

        isALeapYear = year % 4 == 0

        return isALeapYear
    }


    private fun getOrdinalOfMonth(_month: String): Int {
        var ordinalValue = -1

        when (_month) {
            "January" -> ordinalValue = MONTH.January.ordinal
            "February" -> ordinalValue = MONTH.February.ordinal
            "March" -> ordinalValue = MONTH.March.ordinal
            "April" -> ordinalValue = MONTH.April.ordinal
            "May" -> ordinalValue = MONTH.May.ordinal
            "June" -> ordinalValue = MONTH.June.ordinal
            "July" -> ordinalValue = MONTH.July.ordinal
            "August" -> ordinalValue = MONTH.August.ordinal
            "September" -> ordinalValue = MONTH.September.ordinal
            "October" -> ordinalValue = MONTH.October.ordinal
            "November" -> ordinalValue = MONTH.November.ordinal
            "December" -> ordinalValue = MONTH.December.ordinal

            else -> {
            }
        }
        return ordinalValue

    }
}
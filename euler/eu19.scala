import java.util.Date

val sundays = (1 to 100)
				.flatMap(year => (0 to 11).map(month => new Date(year,month,1)))
				.filter(d => d.getDay == 0)
				.toList
				.length
				

println(sundays)
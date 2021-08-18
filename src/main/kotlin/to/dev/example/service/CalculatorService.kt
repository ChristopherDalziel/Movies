package to.dev.example.service

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.QueryParam

class CalculatorService {
    fun add(a: Double, b: Double): Double {
        return a + b
    }

//    @Path("/subtract")
//    @GET
//    fun subtract(@QueryParam("a") a: Double, @QueryParam("b") b: Double): Double {
//        return a - b
//    }
//
//    @Path("/multiply")
//    @GET
//    fun multiply(@QueryParam("a") a: Double, @QueryParam("b") b: Double): Double {
//        return a * b
//    }
//
//    @Path("/divide")
//    @GET
//    fun divide(@QueryParam("a") a: Double, @QueryParam("b") b: Double): Double {
//        return a / b
//    }
}
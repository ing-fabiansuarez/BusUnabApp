package software.mys.fabiansuarez.busunabapp

fun fakeDataBus(): ArrayList<Bus> {

// Crear una lista mutable para almacenar los buses
    val busList = ArrayList<Bus>()

// Crear y agregar los registros de buses a la lista
    val driver1 = Driver(
        "Juan",
        "https://www.leaseplango.es/blog/wp-content/uploads/2017/12/habitos-buen-conductor.png"
    )
    val bus1 = Bus("Bus Uno", driver1)
    busList.add(bus1)

    val driver2 = Driver(
        "María",
        "https://st3.depositphotos.com/1001545/19034/i/450/depositphotos_190342212-stock-photo-happy-owner-of-a-new.jpg"
    )
    val bus2 = Bus("Bus Dos", driver2)
    busList.add(bus2)

    val driver3 = Driver(
        "Carlos",
        "https://cmsresources.elempleo.com/co/assets/backend/styles/770x513/public/fotos/noticias/camion.jpeg"
    )
    val bus3 = Bus("Bus Tres", driver3)
    busList.add(bus3)

    val driver4 = Driver(
        "Luisa",
        "https://cmsresources.elempleo.com/co/assets/backend/styles/770x513/public/fotos/noticias/camion.jpeg"
    )
    val bus4 = Bus("Bus Cuatro", driver4)
    busList.add(bus4)

    val driver5 = Driver(
        "Andrés",
        "https://www.leaseplango.es/blog/wp-content/uploads/2017/12/habitos-buen-conductor.png"
    )
    val bus5 = Bus("Bus Cinco", driver5)
    busList.add(bus5)

    val driver6 = Driver(
        "Ana",
        "https://cmsresources.elempleo.com/co/assets/backend/styles/770x513/public/fotos/noticias/camion.jpeg"
    )
    val bus6 = Bus("Bus Seis", driver6)
    busList.add(bus6)

    val driver7 = Driver(
        "Diego",
        "https://st3.depositphotos.com/1001545/19034/i/450/depositphotos_190342212-stock-photo-happy-owner-of-a-new.jpg"
    )
    val bus7 = Bus("Bus Siete", driver7)
    busList.add(bus7)

    val driver8 = Driver(
        "Laura",
        "https://www.leaseplango.es/blog/wp-content/uploads/2017/12/habitos-buen-conductor.png"
    )
    val bus8 = Bus("Bus Ocho", driver8)
    busList.add(bus8)

    val driver9 = Driver(
        "Santiago",
        "https://cmsresources.elempleo.com/co/assets/backend/styles/770x513/public/fotos/noticias/camion.jpeg"
    )
    val bus9 = Bus("Bus Nueve", driver9)
    busList.add(bus9)

    val driver10 = Driver(
        "Elena",
        "https://st3.depositphotos.com/1001545/19034/i/450/depositphotos_190342212-stock-photo-happy-owner-of-a-new.jpg"
    )
    val bus10 = Bus("Bus Diez", driver10)
    busList.add(bus10)

    return  busList
}
class EnjoyVehicle {

    public static void startVehicle() {
        // start your vehicle
        Vehicle.Engine eng = new Vehicle().new Engine();
        eng.start();
    }
}
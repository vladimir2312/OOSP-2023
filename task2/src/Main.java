
public class Main {
    public static void main(String[] args) {
        BuildingFactory residentialBuildingFactory = new ResidentialBuildingFactory();
        BuildingFactory commercialBuildingFactory = new CommercialBuildingFactory();
        BuildingFactory industrialBuildingFactory = new IndustrialBuildingFactory();

        Building residentialBuilding = residentialBuildingFactory.createBuilding();
        Building commercialBuilding = commercialBuildingFactory.createBuilding();
        Building industrialBuilding = industrialBuildingFactory.createBuilding();

        residentialBuilding.build();
        commercialBuilding.build();
        industrialBuilding.build();
    }
}
//9 Вариант
//Разработайте игру "Симулятор города", где абстрактная фабрика создает разные типы зданий (жилые, коммерческие, промышленные).
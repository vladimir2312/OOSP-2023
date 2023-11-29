class IndustrialBuildingFactory extends BuildingFactory {
    @Override
    Building createBuilding() {
        return new IndustrialBuilding();
    }
}
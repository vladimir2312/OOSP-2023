class CommercialBuildingFactory extends BuildingFactory {
    @Override
    Building createBuilding() {
        return new CommercialBuilding();
    }
}

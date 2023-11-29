class ResidentialBuildingFactory extends BuildingFactory {
    @Override
    Building createBuilding() {
        return new ResidentialBuilding();
    }
}

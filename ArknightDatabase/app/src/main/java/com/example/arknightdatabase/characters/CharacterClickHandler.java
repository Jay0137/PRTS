
    @Override
    public void onCantabileClick() {
        startCharacterActivity("Cantabile");
    }

    @Override
    public void onBlacknightclick() {
        startCharacterActivity("Blacknight");
    }

    @Override
    public void onwildManeclick() {
        startCharacterActivity("wildMan");
    }

    @Override
    public void onFlametail() {
        startCharacterActivity("Flametail");
    }

    @Override
    public void onSaileach() {
        startCharacterActivity("Saileach");
    }

    @Override
    public void onSaga() {
        startCharacterActivity("Saga");
    }

    @Override
    public void onBeanstalk() {
        startCharacterActivity("Beanstalk");
    }

    @Override
    public void onReserveOperatorMale() {
        startCharacterActivity("ReserveOperatorMale");
    }

    @Override
    public void onChiave() {
        startCharacterActivity("Chiave");
    }

    @Override
    public void onElysium() {
        startCharacterActivity("Elysium");
    }

    @Override
    public void onBagpipe() {
        startCharacterActivity("Bagpipe");
    }

    @Override
    public void onReed() {
        startCharacterActivity("Reed");
    }

    @Override
    public void onMyrtle() {
        startCharacterActivity("Myrtle");
    }

    @Override
    public void onGrani() {
        startCharacterActivity("Grani");
    }

    @Override
    public void onSiege() {
        startCharacterActivity("Siege");
    }

    @Override
    public void onZima() {
        startCharacterActivity("Zima");
    }

    @Override
    public void onVigna() {
        startCharacterActivity("Vigna");
    }

    @Override
    public void onScaveenger() {
        startCharacterActivity("Scaveenger");
    }

    @Override
    public void onCourier() {
        startCharacterActivity("Courier");
    }

    @Override
    public void onPlume() {
        startCharacterActivity("Plume");
    }

    @Override
    public void onVanilla() {
        startCharacterActivity("Vanilla");
    }

    @Override
    public void onFang() {
        startCharacterActivity("Fang");
    }

    @Override
    public void onYato() {
        startCharacterActivity("Yato");
    }

    private void startCharacterActivity(String name) {
        Intent intent = new Intent(context, ProfileCharacter.class);
        intent.putExtra("name", name);
        context.startActivity(intent);
    }
}
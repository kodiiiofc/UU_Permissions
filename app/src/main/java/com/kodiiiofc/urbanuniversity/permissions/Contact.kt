package com.kodiiiofc.urbanuniversity.permissions

data class Contact(val name: String, var phone: String) {
    companion object {
        val list = listOf(
            Contact("John Doe", "+1-555-123-4567"),
            Contact("Jane Smith", "+1-555-987-6543"),
            Contact("Michael Johnson", "+1-555-111-2222"),
            Contact("Emily Davis", "+1-555-333-4444"),
            Contact("David Brown", "+1-555-555-6666"),
            Contact("Sarah Wilson", "+1-555-777-8888"),
            Contact("James Moore", "+1-555-999-0000"),
            Contact("Anna Taylor", "+1-555-222-3333"),
            Contact("Robert Anderson", "+1-555-444-5555"),
            Contact("Linda Thomas", "+1-555-666-7777"),
            Contact("Chris Martinez", "+1-555-888-9999"),
            Contact("Jessica Lee", "+1-555-111-1111"),
            Contact("Brian Harris", "+1-555-222-2222"),
            Contact("Laura Clark", "+1-555-333-3333"),
            Contact("Daniel Lewis", "+1-555-444-4444"),
            Contact("Sophia Walker", "+1-555-555-5555"),
            Contact("Mark Hall", "+1-555-666-6666"),
            Contact("Megan Allen", "+1-555-777-7777"),
            Contact("Paul Young", "+1-555-888-8888"),
            Contact("Diana King", "+1-555-999-9999"),
            Contact("Scott Wright", "+1-555-101-0101"),
            Contact("Natalie Green", "+1-555-202-0202"),
            Contact("Kevin Baker", "+1-555-303-0303"),
            Contact("Olivia Adams", "+1-555-404-0404"),
            Contact("Jason Nelson", "+1-555-505-0505"),
            Contact("Victoria Carter", "+1-555-606-0606"),
            Contact("Aaron Perez", "+1-555-707-0707"),
            Contact("Rebecca Roberts", "+1-555-808-0808"),
            Contact("Joshua Phillips", "+1-555-909-0909"),
            Contact("Evelyn Campbell", "+1-555-010-1010")
        )
    }
}

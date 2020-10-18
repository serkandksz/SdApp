package com.serkan.sdapp

import com.serkan.sdapp.fragments.Product
import com.serkan.sdapp.fragments.ProductCategory





fun getSubCategoryEt(): ArrayList<String>{
    val product1 = Product(
        "Et ve Tavuk",
        "tavuk",
        "tavuk but",
        R.drawable.ic_launcher_foreground,
        "1kg",
        "15Tl",
        "10Tl"
    )
    val product2 = Product(
        "Et ve Tavuk",
        "tavuk",
        "tavuk kanat",
        R.drawable.ic_launcher_foreground,
        "1kg",
        "18Tl",
        "13Tl"
    )
    val product3 = Product(
        "Et ve Tavuk",
        "tavuk",
        "tavuk göğüs",
        R.drawable.ic_launcher_foreground,
        "1kg",
        "15Tl",
        "12Tl"
    )
    val product4 =
        Product(
            "Et ve Tavuk",
            "et",
            "kıyma",
            R.drawable.ic_launcher_foreground,
            "1kg",
            "40Tl",
            "30Tl"
        )
    val product5 = Product(
        "İçecek",
        "su",
        "hayat su",
        R.drawable.ic_launcher_foreground,
        "1,5litre",
        "2,00Tl",
        "1,5Tl"
    )
    val product6 = Product(
        "Sebze ve Meyve",
        "portakal",
        "portakal",
        R.drawable.ic_launcher_foreground,
        "1,5litre",
        "2,00Tl",
        "1,5Tl"
    )
    val product7 = Product(
        "Sebze ve Meyve",
        "elma",
        "elma",
        R.drawable.ic_launcher_foreground,
        "1,5litre",
        "2,00Tl",
        "1,5Tl"
    )

    val productList = arrayListOf<Product>(product1, product2, product3, product4, product5,product6,product7)
    //main-category
    val etVeTavukProducts = arrayListOf<Product>()
    val etVeTavukProductsSub = arrayListOf<String>()

    val icecekProducts = arrayListOf<Product>()
    val icecekProductsSub = arrayListOf<String>()

    val sebzeVeMeyveProducts = arrayListOf<Product>()
    val sebzeVeMeyveProductsSub = arrayListOf<String>()

    val sutVeSutUrunProducts = arrayListOf<Product>()
    val sutVeSutUrunProductsSub = arrayListOf<String>()

    for (i in productList) {
        if (i.category.equals("Et ve Tavuk")) {
            etVeTavukProducts.add(i)
            if (!etVeTavukProductsSub.contains(i.id)) {
                etVeTavukProductsSub.add(i.id)
            }
        } else if (i.category.equals("İçecek")) {
            icecekProducts.add(i)
            if (!icecekProductsSub.contains(i.id)) {
                icecekProductsSub.add(i.id)
            }
        } else if (i.category.equals("Sebze ve Meyve")) {
            sebzeVeMeyveProducts.add(i)
            if (!sebzeVeMeyveProductsSub.contains(i.id)) {
                sebzeVeMeyveProductsSub.add(i.id)
            }
        } else if (i.category.equals("Süt ve Süt Ürünleri")) {
            sutVeSutUrunProducts.add(i)
            if (!sutVeSutUrunProductsSub.contains(i.id)) {
                sutVeSutUrunProductsSub.add(i.id)
            }


        }
    }
    return etVeTavukProductsSub
}

fun getSubCategoryIcecek(): ArrayList<String>{
    val product1 = Product(
        "Et ve Tavuk",
        "tavuk",
        "tavuk but",
        R.drawable.ic_launcher_foreground,
        "1kg",
        "15Tl",
        "10Tl"
    )
    val product2 = Product(
        "Et ve Tavuk",
        "tavuk",
        "tavuk kanat",
        R.drawable.ic_launcher_foreground,
        "1kg",
        "18Tl",
        "13Tl"
    )
    val product3 = Product(
        "Et ve Tavuk",
        "tavuk",
        "tavuk göğüs",
        R.drawable.ic_launcher_foreground,
        "1kg",
        "15Tl",
        "12Tl"
    )
    val product4 =
        Product(
            "Et ve Tavuk",
            "et",
            "kıyma",
            R.drawable.ic_launcher_foreground,
            "1kg",
            "40Tl",
            "30Tl"
        )
    val product5 = Product(
        "İçecek",
        "su",
        "hayat su",
        R.drawable.ic_launcher_foreground,
        "1,5litre",
        "2,00Tl",
        "1,5Tl"
    )
    val product6 = Product(
        "Sebze ve Meyve",
        "portakal",
        "portakal",
        R.drawable.ic_launcher_foreground,
        "1,5litre",
        "2,00Tl",
        "1,5Tl"
    )
    val product7 = Product(
        "Sebze ve Meyve",
        "elma",
        "elma",
        R.drawable.ic_launcher_foreground,
        "1,5litre",
        "2,00Tl",
        "1,5Tl"
    )

    val productList = arrayListOf<Product>(product1, product2, product3, product4, product5,product6,product7)
    //main-category
    val etVeTavukProducts = arrayListOf<Product>()
    val etVeTavukProductsSub = arrayListOf<String>()

    val icecekProducts = arrayListOf<Product>()
    val icecekProductsSub = arrayListOf<String>()

    val sebzeVeMeyveProducts = arrayListOf<Product>()
    val sebzeVeMeyveProductsSub = arrayListOf<String>()

    val sutVeSutUrunProducts = arrayListOf<Product>()
    val sutVeSutUrunProductsSub = arrayListOf<String>()

    for (i in productList) {
        if (i.category.equals("Et ve Tavuk")) {
            etVeTavukProducts.add(i)
            if (!etVeTavukProductsSub.contains(i.id)) {
                etVeTavukProductsSub.add(i.id)
            }
        } else if (i.category.equals("İçecek")) {
            icecekProducts.add(i)
            if (!icecekProductsSub.contains(i.id)) {
                icecekProductsSub.add(i.id)
            }
        } else if (i.category.equals("Sebze ve Meyve")) {
            sebzeVeMeyveProducts.add(i)
            if (!sebzeVeMeyveProductsSub.contains(i.id)) {
                sebzeVeMeyveProductsSub.add(i.id)
            }
        } else if (i.category.equals("Süt ve Süt Ürünleri")) {
            sutVeSutUrunProducts.add(i)
            if (!sutVeSutUrunProductsSub.contains(i.id)) {
                sutVeSutUrunProductsSub.add(i.id)
            }


        }
    }
    return icecekProductsSub
}

fun getSubCategorySutVeSutU(): ArrayList<String>{
    val product1 = Product(
        "Et ve Tavuk",
        "tavuk",
        "tavuk but",
        R.drawable.ic_launcher_foreground,
        "1kg",
        "15Tl",
        "10Tl"
    )
    val product2 = Product(
        "Et ve Tavuk",
        "tavuk",
        "tavuk kanat",
        R.drawable.ic_launcher_foreground,
        "1kg",
        "18Tl",
        "13Tl"
    )
    val product3 = Product(
        "Et ve Tavuk",
        "tavuk",
        "tavuk göğüs",
        R.drawable.ic_launcher_foreground,
        "1kg",
        "15Tl",
        "12Tl"
    )
    val product4 =
        Product(
            "Et ve Tavuk",
            "et",
            "kıyma",
            R.drawable.ic_launcher_foreground,
            "1kg",
            "40Tl",
            "30Tl"
        )
    val product5 = Product(
        "İçecek",
        "su",
        "hayat su",
        R.drawable.ic_launcher_foreground,
        "1,5litre",
        "2,00Tl",
        "1,5Tl"
    )
    val product6 = Product(
        "Sebze ve Meyve",
        "portakal",
        "portakal",
        R.drawable.ic_launcher_foreground,
        "1,5litre",
        "2,00Tl",
        "1,5Tl"
    )
    val product7 = Product(
        "Sebze ve Meyve",
        "elma",
        "elma",
        R.drawable.ic_launcher_foreground,
        "1,5litre",
        "2,00Tl",
        "1,5Tl"
    )
    val product8 = Product(
        "Süt ve Süt Ürünleri",
        "süt",
        "süt",
        R.drawable.ic_launcher_foreground,
        "1,5litre",
        "2,00Tl",
        "1,5Tl"
    )

    val productList = arrayListOf<Product>(product1, product2, product3, product4, product5,product6,product7,product8)
    //main-category
    val etVeTavukProducts = arrayListOf<Product>()
    val etVeTavukProductsSub = arrayListOf<String>()

    val icecekProducts = arrayListOf<Product>()
    val icecekProductsSub = arrayListOf<String>()

    val sebzeVeMeyveProducts = arrayListOf<Product>()
    val sebzeVeMeyveProductsSub = arrayListOf<String>()

    val sutVeSutUrunProducts = arrayListOf<Product>()
    val sutVeSutUrunProductsSub = arrayListOf<String>()

    for (i in productList) {
        if (i.category.equals("Et ve Tavuk")) {
            etVeTavukProducts.add(i)
            if (!etVeTavukProductsSub.contains(i.id)) {
                etVeTavukProductsSub.add(i.id)
            }
        } else if (i.category.equals("İçecek")) {
            icecekProducts.add(i)
            if (!icecekProductsSub.contains(i.id)) {
                icecekProductsSub.add(i.id)
            }
        } else if (i.category.equals("Sebze ve Meyve")) {
            sebzeVeMeyveProducts.add(i)
            if (!sebzeVeMeyveProductsSub.contains(i.id)) {
                sebzeVeMeyveProductsSub.add(i.id)
            }
        } else if (i.category.equals("Süt ve Süt Ürünleri")) {
            sutVeSutUrunProducts.add(i)
            if (!sutVeSutUrunProductsSub.contains(i.id)) {
                sutVeSutUrunProductsSub.add(i.id)
            }


        }
    }
    return sutVeSutUrunProductsSub
}

fun getSubCategorySebzeMeyve(): ArrayList<String>{
    val product1 = Product(
        "Et ve Tavuk",
        "tavuk",
        "tavuk but",
        R.drawable.ic_launcher_foreground,
        "1kg",
        "15Tl",
        "10Tl"
    )
    val product2 = Product(
        "Et ve Tavuk",
        "tavuk",
        "tavuk kanat",
        R.drawable.ic_launcher_foreground,
        "1kg",
        "18Tl",
        "13Tl"
    )
    val product3 = Product(
        "Et ve Tavuk",
        "tavuk",
        "tavuk göğüs",
        R.drawable.ic_launcher_foreground,
        "1kg",
        "15Tl",
        "12Tl"
    )
    val product4 =
        Product(
            "Et ve Tavuk",
            "et",
            "kıyma",
            R.drawable.ic_launcher_foreground,
            "1kg",
            "40Tl",
            "30Tl"
        )
    val product5 = Product(
        "İçecek",
        "su",
        "hayat su",
        R.drawable.ic_launcher_foreground,
        "1,5litre",
        "2,00Tl",
        "1,5Tl"
    )
    val product6 = Product(
        "Sebze ve Meyve",
        "portakal",
        "portakal",
        R.drawable.ic_launcher_foreground,
        "1,5litre",
        "2,00Tl",
        "1,5Tl"
    )
    val product7 = Product(
        "Sebze ve Meyve",
        "elma",
        "elma",
        R.drawable.ic_launcher_foreground,
        "1,5litre",
        "2,00Tl",
        "1,5Tl"
    )

    val productList = arrayListOf<Product>(product1, product2, product3, product4, product5,product6,product7)
    //main-category
    val etVeTavukProducts = arrayListOf<Product>()
    val etVeTavukProductsSub = arrayListOf<String>()

    val icecekProducts = arrayListOf<Product>()
    val icecekProductsSub = arrayListOf<String>()

    val sebzeVeMeyveProducts = arrayListOf<Product>()
    val sebzeVeMeyveProductsSub = arrayListOf<String>()

    val sutVeSutUrunProducts = arrayListOf<Product>()
    val sutVeSutUrunProductsSub = arrayListOf<String>()

    for (i in productList) {
        if (i.category.equals("Et ve Tavuk")) {
            etVeTavukProducts.add(i)
            if (!etVeTavukProductsSub.contains(i.id)) {
                etVeTavukProductsSub.add(i.id)
            }
        } else if (i.category.equals("İçecek")) {
            icecekProducts.add(i)
            if (!icecekProductsSub.contains(i.id)) {
                icecekProductsSub.add(i.id)
            }
        } else if (i.category.equals("Sebze ve Meyve")) {
            sebzeVeMeyveProducts.add(i)
            if (!sebzeVeMeyveProductsSub.contains(i.id)) {
                sebzeVeMeyveProductsSub.add(i.id)
            }
        } else if (i.category.equals("Süt ve Süt Ürünleri")) {
            sutVeSutUrunProducts.add(i)
            if (!sutVeSutUrunProductsSub.contains(i.id)) {
                sutVeSutUrunProductsSub.add(i.id)
            }


        }
    }
    return sebzeVeMeyveProductsSub
}




fun getDataEtTavuk(): ArrayList<ProductCategory> {


    val product1 = Product(
        "Et ve Tavuk",
        "tavuk",
        "tavuk but",
        R.drawable.ic_launcher_foreground,
        "1kg",
        "15Tl",
        "10Tl"
    )
    val product9 = Product(
        "Et ve Tavuk",
        "tavuk",
        "tavuk but",
        R.drawable.ic_launcher_foreground,
        "1kg",
        "15Tl",
        "10Tl"
    )
    val product10 = Product(
        "Et ve Tavuk",
        "tavuk",
        "tavuk but",
        R.drawable.ic_launcher_foreground,
        "1kg",
        "15Tl",
        "10Tl"
    )
    val product11 = Product(
        "Et ve Tavuk",
        "tavuk",
        "tavuk but",
        R.drawable.ic_launcher_foreground,
        "1kg",
        "15Tl",
        "10Tl"
    )
    val product2 = Product(
        "Et ve Tavuk",
        "tavuk",
        "tavuk kanat",
        R.drawable.ic_launcher_foreground,
        "1kg",
        "18Tl",
        "13Tl"
    )
    val product3 = Product(
        "Et ve Tavuk",
        "tavuk",
        "tavuk göğüs",
        R.drawable.ic_launcher_foreground,
        "1kg",
        "15Tl",
        "12Tl"
    )
    val product4 =
        Product(
            "Et ve Tavuk",
            "et",
            "kıyma",
            R.drawable.ic_launcher_foreground,
            "1kg",
            "40Tl",
            "30Tl"
        )
    val product12 =
        Product(
            "Et ve Tavuk",
            "et",
            "kıyma",
            R.drawable.ic_launcher_foreground,
            "1kg",
            "40Tl",
            "30Tl"
        )
    val product13 =
        Product(
            "Et ve Tavuk",
            "et",
            "kıyma",
            R.drawable.ic_launcher_foreground,
            "1kg",
            "40Tl",
            "30Tl"
        )
    val product14 =
        Product(
            "Et ve Tavuk",
            "et",
            "kıyma",
            R.drawable.ic_launcher_foreground,
            "1kg",
            "40Tl",
            "30Tl"
        )
    val product15 =
        Product(
            "Et ve Tavuk",
            "et",
            "kıyma",
            R.drawable.ic_launcher_foreground,
            "1kg",
            "40Tl",
            "30Tl"
        )
    val product5 = Product(
        "İçecek",
        "su",
        "hayat su",
        R.drawable.ic_launcher_foreground,
        "1,5litre",
        "2,00Tl",
        "1,5Tl"
    )
    val product6 = Product(
        "Sebze ve Meyve",
        "portakal",
        "portakal",
        R.drawable.ic_launcher_foreground,
        "1,5litre",
        "2,00Tl",
        "1,5Tl"
    )
    val product7 = Product(
        "Sebze ve Meyve",
        "elma",
        "elma",
        R.drawable.ic_launcher_foreground,
        "1,5litre",
        "2,00Tl",
        "1,5Tl"
    )

    val productList = arrayListOf<Product>(product1, product2, product3, product4, product5,product6,product7,product9,product10,product11,product12,product13,product14,product15)

    //main-category
    val etVeTavukProducts = arrayListOf<Product>()
    val etVeTavukProductsSub = arrayListOf<String>()

    val icecekProducts = arrayListOf<Product>()
    val icecekProductsSub = arrayListOf<String>()

    val sebzeVeMeyveProducts = arrayListOf<Product>()
    val sebzeVeMeyveProductsSub = arrayListOf<String>()

    val sutVeSutUrunProducts = arrayListOf<Product>()
    val sutVeSutUrunProductsSub = arrayListOf<String>()

    for (i in productList) {
        if (i.category.equals("Et ve Tavuk")) {
            etVeTavukProducts.add(i)
            if (!etVeTavukProductsSub.contains(i.id)) {
                etVeTavukProductsSub.add(i.id)
            }
        } else if (i.category.equals("İçecek")) {
            icecekProducts.add(i)
            if (!icecekProductsSub.contains(i.id)) {
                icecekProductsSub.add(i.id)
            }
        } else if (i.category.equals("Sebze ve Meyve")) {
            sebzeVeMeyveProducts.add(i)
            if (!sebzeVeMeyveProductsSub.contains(i.id)) {
                sebzeVeMeyveProductsSub.add(i.id)
            }
        } else if (i.category.equals("Süt ve Süt Ürünleri")) {
            sutVeSutUrunProducts.add(i)
            if (!sutVeSutUrunProductsSub.contains(i.id)) {
                sutVeSutUrunProductsSub.add(i.id)
            }


        }
    }


    val productCategory = arrayListOf<ProductCategory>()
    for (a in 0..etVeTavukProductsSub.size - 1) {
        val productsList = arrayListOf<Product>()
        for (b in 0..etVeTavukProducts.size - 1) {
            if (etVeTavukProductsSub[a] == etVeTavukProducts[b].id) {
                val products = etVeTavukProducts[b]
                productsList.add(products)
            }

        }
        productCategory += ProductCategory("$a", etVeTavukProductsSub[a], productsList)
    }

    return productCategory
}



fun getDataIcecek(): ArrayList<ProductCategory> {


    val product1 = Product(
        "Et ve Tavuk",
        "tavuk",
        "tavuk but",
        R.drawable.ic_launcher_foreground,
        "1kg",
        "15Tl",
        "10Tl"
    )
    val product2 = Product(
        "Et ve Tavuk",
        "tavuk",
        "tavuk kanat",
        R.drawable.ic_launcher_foreground,
        "1kg",
        "18Tl",
        "13Tl"
    )
    val product3 = Product(
        "Et ve Tavuk",
        "tavuk",
        "tavuk göğüs",
        R.drawable.ic_launcher_foreground,
        "1kg",
        "15Tl",
        "12Tl"
    )
    val product4 =
        Product(
            "Et ve Tavuk",
            "et",
            "kıyma",
            R.drawable.ic_launcher_foreground,
            "1kg",
            "40Tl",
            "30Tl"
        )
    val product5 = Product(
        "İçecek",
        "su",
        "hayat su",
        R.drawable.ic_launcher_foreground,
        "1,5litre",
        "2,00Tl",
        "1,5Tl"
    )
    val product6 = Product(
        "Sebze ve Meyve",
        "portakal",
        "portakal",
        R.drawable.ic_launcher_foreground,
        "1,5litre",
        "2,00Tl",
        "1,5Tl"
    )
    val product7 = Product(
        "Sebze ve Meyve",
        "elma",
        "elma",
        R.drawable.ic_launcher_foreground,
        "1,5litre",
        "2,00Tl",
        "1,5Tl"
    )

    val productList = arrayListOf<Product>(product1, product2, product3, product4, product5,product6,product7)

    //main-category
    val etVeTavukProducts = arrayListOf<Product>()
    val etVeTavukProductsSub = arrayListOf<String>()

    val icecekProducts = arrayListOf<Product>()
    val icecekProductsSub = arrayListOf<String>()

    val sebzeVeMeyveProducts = arrayListOf<Product>()
    val sebzeVeMeyveProductsSub = arrayListOf<String>()

    val sutVeSutUrunProducts = arrayListOf<Product>()
    val sutVeSutUrunProductsSub = arrayListOf<String>()

    for (i in productList) {
        if (i.category.equals("Et ve Tavuk")) {
            etVeTavukProducts.add(i)
            if (!etVeTavukProductsSub.contains(i.id)) {
                etVeTavukProductsSub.add(i.id)
            }
        } else if (i.category.equals("İçecek")) {
            icecekProducts.add(i)
            if (!icecekProductsSub.contains(i.id)) {
                icecekProductsSub.add(i.id)
            }
        } else if (i.category.equals("Sebze ve Meyve")) {
            sebzeVeMeyveProducts.add(i)
            if (!sebzeVeMeyveProductsSub.contains(i.id)) {
                sebzeVeMeyveProductsSub.add(i.id)
            }
        } else if (i.category.equals("Süt ve Süt Ürünleri")) {
            sutVeSutUrunProducts.add(i)
            if (!sutVeSutUrunProductsSub.contains(i.id)) {
                sutVeSutUrunProductsSub.add(i.id)
            }


        }
    }


    val productCategory = arrayListOf<ProductCategory>()
    for (a in 0..icecekProductsSub.size - 1) {
        val productsList = arrayListOf<Product>()
        for (b in 0..icecekProducts.size - 1) {
            if (icecekProductsSub[a] == icecekProducts[b].id) {
                val products = icecekProducts[b]
                productsList.add(products)
            }

        }
        productCategory += ProductCategory("$a", icecekProductsSub[a], productsList)
    }

    return productCategory
}
fun getDataSebzeMevye(): ArrayList<ProductCategory> {


    val product1 = Product(
        "Et ve Tavuk",
        "tavuk",
        "tavuk but",
        R.drawable.ic_launcher_foreground,
        "1kg",
        "15Tl",
        "10Tl"
    )
    val product2 = Product(
        "Et ve Tavuk",
        "tavuk",
        "tavuk kanat",
        R.drawable.ic_launcher_foreground,
        "1kg",
        "18Tl",
        "13Tl"
    )
    val product3 = Product(
        "Et ve Tavuk",
        "tavuk",
        "tavuk göğüs",
        R.drawable.ic_launcher_foreground,
        "1kg",
        "15Tl",
        "12Tl"
    )
    val product4 =
        Product(
            "Et ve Tavuk",
            "et",
            "kıyma",
            R.drawable.ic_launcher_foreground,
            "1kg",
            "40Tl",
            "30Tl"
        )
    val product5 = Product(
        "İçecek",
        "su",
        "hayat su",
        R.drawable.ic_launcher_foreground,
        "1,5litre",
        "2,00Tl",
        "1,5Tl"
    )
    val product6 = Product(
        "Sebze ve Meyve",
        "portakal",
        "portakal",
        R.drawable.ic_launcher_foreground,
        "1,5litre",
        "2,00Tl",
        "1,5Tl"
    )
    val product7 = Product(
        "Sebze ve Meyve",
        "elma",
        "elma",
        R.drawable.ic_launcher_foreground,
        "1,5litre",
        "2,00Tl",
        "1,5Tl"
    )

    val productList = arrayListOf<Product>(product1, product2, product3, product4, product5,product6,product7)

    //main-category
    val etVeTavukProducts = arrayListOf<Product>()
    val etVeTavukProductsSub = arrayListOf<String>()

    val icecekProducts = arrayListOf<Product>()
    val icecekProductsSub = arrayListOf<String>()

    val sebzeVeMeyveProducts = arrayListOf<Product>()
    val sebzeVeMeyveProductsSub = arrayListOf<String>()

    val sutVeSutUrunProducts = arrayListOf<Product>()
    val sutVeSutUrunProductsSub = arrayListOf<String>()

    for (i in productList) {
        if (i.category.equals("Et ve Tavuk")) {
            etVeTavukProducts.add(i)
            if (!etVeTavukProductsSub.contains(i.id)) {
                etVeTavukProductsSub.add(i.id)
            }
        } else if (i.category.equals("İçecek")) {
            icecekProducts.add(i)
            if (!icecekProductsSub.contains(i.id)) {
                icecekProductsSub.add(i.id)
            }
        } else if (i.category.equals("Sebze ve Meyve")) {
            sebzeVeMeyveProducts.add(i)
            if (!sebzeVeMeyveProductsSub.contains(i.id)) {
                sebzeVeMeyveProductsSub.add(i.id)
            }
        } else if (i.category.equals("Süt ve Süt Ürünleri")) {
            sutVeSutUrunProducts.add(i)
            if (!sutVeSutUrunProductsSub.contains(i.id)) {
                sutVeSutUrunProductsSub.add(i.id)
            }


        }
    }


    val productCategory = arrayListOf<ProductCategory>()
    for (a in 0..sebzeVeMeyveProductsSub.size - 1) {
        val productsList = arrayListOf<Product>()
        for (b in 0..sebzeVeMeyveProducts.size - 1) {
            if (sebzeVeMeyveProductsSub[a] == sebzeVeMeyveProducts[b].id) {
                val products = sebzeVeMeyveProducts[b]
                productsList.add(products)
            }

        }
        productCategory += ProductCategory("$a", sebzeVeMeyveProductsSub[a], productsList)
    }

    return productCategory
}
fun getDataSutVeSutUrun(): ArrayList<ProductCategory> {


    val product1 = Product(
        "Et ve Tavuk",
        "tavuk",
        "tavuk but",
        R.drawable.ic_launcher_foreground,
        "1kg",
        "15Tl",
        "10Tl"
    )
    val product2 = Product(
        "Et ve Tavuk",
        "tavuk",
        "tavuk kanat",
        R.drawable.ic_launcher_foreground,
        "1kg",
        "18Tl",
        "13Tl"
    )
    val product3 = Product(
        "Et ve Tavuk",
        "tavuk",
        "tavuk göğüs",
        R.drawable.ic_launcher_foreground,
        "1kg",
        "15Tl",
        "12Tl"
    )
    val product4 =
        Product(
            "Et ve Tavuk",
            "et",
            "kıyma",
            R.drawable.ic_launcher_foreground,
            "1kg",
            "40Tl",
            "30Tl"
        )
    val product5 = Product(
        "İçecek",
        "su",
        "hayat su",
        R.drawable.ic_launcher_foreground,
        "1,5litre",
        "2,00Tl",
        "1,5Tl"
    )
    val product6 = Product(
        "Sebze ve Meyve",
        "portakal",
        "portakal",
        R.drawable.ic_launcher_foreground,
        "1,5litre",
        "2,00Tl",
        "1,5Tl"
    )
    val product7 = Product(
        "Sebze ve Meyve",
        "elma",
        "elma",
        R.drawable.ic_launcher_foreground,
        "1,5litre",
        "2,00Tl",
        "1,5Tl"
    )
    val product8 = Product(
        "Süt ve Süt Ürünleri",
        "süt",
        "süt",
        R.drawable.ic_launcher_foreground,
        "1,5litre",
        "2,00Tl",
        "1,5Tl"
    )

    val productList = arrayListOf<Product>(
        product1,
        product2,
        product3,
        product4,
        product5,
        product6,
        product7,
        product8
    )

    //main-category
    val etVeTavukProducts = arrayListOf<Product>()
    val etVeTavukProductsSub = arrayListOf<String>()

    val icecekProducts = arrayListOf<Product>()
    val icecekProductsSub = arrayListOf<String>()

    val sebzeVeMeyveProducts = arrayListOf<Product>()
    val sebzeVeMeyveProductsSub = arrayListOf<String>()

    val sutVeSutUrunProducts = arrayListOf<Product>()
    val sutVeSutUrunProductsSub = arrayListOf<String>()

    for (i in productList) {
        if (i.category.equals("Et ve Tavuk")) {
            etVeTavukProducts.add(i)
            if (!etVeTavukProductsSub.contains(i.id)) {
                etVeTavukProductsSub.add(i.id)
            }
        } else if (i.category.equals("İçecek")) {
            icecekProducts.add(i)
            if (!icecekProductsSub.contains(i.id)) {
                icecekProductsSub.add(i.id)
            }
        } else if (i.category.equals("Sebze ve Meyve")) {
            sebzeVeMeyveProducts.add(i)
            if (!sebzeVeMeyveProductsSub.contains(i.id)) {
                sebzeVeMeyveProductsSub.add(i.id)
            }
        } else if (i.category.equals("Süt ve Süt Ürünleri")) {
            sutVeSutUrunProducts.add(i)
            if (!sutVeSutUrunProductsSub.contains(i.id)) {
                sutVeSutUrunProductsSub.add(i.id)
            }


        }
    }


    val productCategory = arrayListOf<ProductCategory>()
    for (a in 0..sutVeSutUrunProductsSub.size - 1) {
        val productsList = arrayListOf<Product>()
        for (b in 0..sutVeSutUrunProducts.size - 1) {
            if (sutVeSutUrunProductsSub[a] == sutVeSutUrunProducts[b].id) {
                val products = sutVeSutUrunProducts[b]
                productsList.add(products)
            }

        }
        productCategory += ProductCategory("$a", sutVeSutUrunProductsSub[a], productsList)
    }
    
    return productCategory
}
package com.alge.quickcard

data class Flashcard(
    val question: String,
    val answer: String,
    val topic: String
)

object CardRepository {

    val allCards = listOf(
        // --- İslamiyet Öncesi Türk Tarihi deneme xxx ---

        Flashcard("Bilinen ilk kadın hükümdarı Tomris Hatun olan ve ordusunda Amazon adı verilen savaşçı kadınların yer aldığı Türk boyu hangisidir?", "İskitler", "İslamiyet Öncesi Türk Tarihi"),
    Flashcard("Tarihte ilk defa üzengiyi kullanan ve maden işlemeciliğindeki ustalıkları nedeniyle 'Bozkırın Kuyumcuları' olarak adlandırılan Türk topluluğu hangisidir?", "İskitler", "İslamiyet Öncesi Türk Tarihi"),
    Flashcard("Sanat eserlerinde hayvan üslubunu kullanan ve ilk defa balbal diken Türk boyu hangisidir?", "İskitler", "İslamiyet Öncesi Türk Tarihi"),
    Flashcard("Bilinen ve en önemli hükümdarı Alper Tunga olan ilk Türk boyu nedir?", "Asya Hun Devleti", "İslamiyet Öncesi Türk Tarihi"),
    Flashcard("Tarihte bilinen ilk Türk devleti hangisidir?", "Asya Hun Devleti", "İslamiyet Öncesi Türk Tarihi"),
    Flashcard("Asya Hun Devleti'nin kurucusu kimdir?", "Teoman", "İslamiyet Öncesi Türk Tarihi"),
    Flashcard("Asya Hun Devleti'nin başkenti neresidir?", "Ötüken", "İslamiyet Öncesi Türk Tarihi"),
    Flashcard("Asya Hun Devleti'nin en önemli hükümdarı kimdir?", "Mete Han", "İslamiyet Öncesi Türk Tarihi"),
    Flashcard("Kurucusu Balamir olan devlet hangisidir?", "Avrupa Hun Devleti", "İslamiyet Öncesi Türk Tarihi"),
    Flashcard("İstersem güneşin battığı yere kadar her yeri zapt edebilirim diyen ve Uldız zamanında Anadolu'ya ilk defa ayak basan hükümdar kimdir?", "Uldız", "İslamiyet Öncesi Türk Tarihi"),
    Flashcard("Atilla'nın Roma üzerine düzenlediği sefer sonucunda Batı Roma'yı vergiye bağladığı antlaşmalar hangileridir?", "Margus Barışı ve Anatolius Antlaşması", "İslamiyet Öncesi Türk Tarihi"),
    Flashcard("Hristiyanlar tarafından 'Tanrının Kamçısı' ve 'Cesur Kavimlerin Efendisi' unvanları verilen ve Almanların ünlü destanı Nibelungen'de 'Etzel' olarak geçen hükümdar kimdir?", "Atilla", "İslamiyet Öncesi Türk Tarihi"),
    Flashcard("Avar Devleti'nin kurucusu kimdir?", "Bayan Han", "İslamiyet Öncesi Türk Tarihi"),
    Flashcard("Çinlilerin Avarları adlandırmak için kullandığı isim nedir?", "Juan Juan", "İslamiyet Öncesi Türk Tarihi"),
    Flashcard("Göktürklerin Avarlar için kullandığı isim nedir?", "Apar", "İslamiyet Öncesi Türk Tarihi"),
    Flashcard("İstanbul'u Sasani Devleti ile birlikte iki defa kuşatan ilk Türk devleti hangisidir?", "Avarlar", "İslamiyet Öncesi Türk Tarihi"),
    Flashcard("Üzengi'yi Avrupa'ya taşıyan Türk devleti hangisidir?", "Avarlar", "İslamiyet Öncesi Türk Tarihi"),
    Flashcard("Kelime anlamı 'yoldan sapan' olan ve günümüzde Sibirya'ya ismini veren Türk boyu hangisidir?", "Sabirler (Sibirler)", "İslamiyet Öncesi Türk Tarihi"),
    Flashcard("Kelime anlamı 'sarı, sarımsak, sarı saçlı' veya 'öfkeli' olan; Oğuzlarla mücadeleleri Dede Korkut Hikayeleri'ne, Ruslarla mücadeleleri ise Igor Destanı'na konu olan Türk boyu hangisidir?", "Kıpçaklar (Kumanlar)", "İslamiyet Öncesi Türk Tarihi"),
    Flashcard("Türk adıyla kurulan ilk Türk devleti hangisidir?", "Göktürkler", "İslamiyet Öncesi Türk Tarihi"),
    Flashcard("Asya Hunları'ndan sonra Orta Asya'da siyasi birliği sağlayan ikinci Türk devleti hangisidir?", "Göktürkler", "İslamiyet Öncesi Türk Tarihi"),
    Flashcard("Göktürk Devleti'nin kurucusu ve unvanı nedir?", "İl Kağan, Bumin Kağan", "İslamiyet Öncesi Türk Tarihi"),
    Flashcard("İpek Yolu'na hakim olabilmek için önce Sasanilerle anlaşıp Akhunlar'a son veren, daha sonra Bizansla anlaşıp Sasanilerle savaşan devlet hangisidir?", "Göktürkler", "İslamiyet Öncesi Türk Tarihi"),

    Flashcard("Kutluklar devletinin kurucusu kimdir?", "Kutluk Kağan", "İslamiyet Öncesi Türk Tarihi"),
    Flashcard("Orhun Abideleri hangi devlet zamanında oluşturulmuştur?", "Kutluklar", "İslamiyet Öncesi Türk Tarihi"),
    Flashcard("Kutluk Kağan'ın 'İlteriş' unvanının anlamı nedir?", "Derleyen, toplayan", "İslamiyet Öncesi Türk Tarihi"),
    Flashcard("'Türklerin Bismarck'ı' ve 'Apa Tarkan' unvanları verilen vezir kimdir?", "Tonyukuk", "İslamiyet Öncesi Türk Tarihi"),
    Flashcard("Göktürkler en parlak zamanını hangi hükümdar döneminde yaşamıştır?", "Mukan Kağan", "İslamiyet Öncesi Türk Tarihi"),

    Flashcard("Uygur Devleti'nin kurucusu kimdir?", "Kutluk Bilge Kül Kağan", "İslamiyet Öncesi Türk Tarihi"),
    Flashcard("Uygurların başkentleri sırasıyla nerelerdir?", "Ötüken ve Karabalgasun", "İslamiyet Öncesi Türk Tarihi"),
    Flashcard("Uygurların kabul ettiği din hangisidir?", "Maniheizm", "İslamiyet Öncesi Türk Tarihi"),
    Flashcard("Türk tarihinde yerleşik hayata geçilmesiyle birlikte hangi alanlarda gelişim yaşanmıştır?", "Resim, yazı ve mimari", "İslamiyet Öncesi Türk Tarihi"),
    Flashcard("Uygur Devleti'ni yıkarak Ötüken merkezli kurulan devlet hangisidir?", "Kırgızlar", "İslamiyet Öncesi Türk Tarihi"),
    Flashcard("Cengiz Han'a itaat eden ilk Türk devleti hangisidir?", "Kırgızlar", "İslamiyet Öncesi Türk Tarihi"),
    Flashcard("Dünya tarihinde milletler arası ilk yarışmayı düzenleyen devlet hangisidir?", "Kırgızlar", "İslamiyet Öncesi Türk Tarihi"),

    Flashcard("İslamiyet'i kabul eden ilk Türk boyu hangisidir?", "Karluklar", "İslamiyet Öncesi Türk Tarihi"),
    Flashcard("Cengiz Han'a itaat eden ilk Müslüman Türk topluluğu hangisidir?", "Karluklar", "İslamiyet Öncesi Türk Tarihi"),
    Flashcard("Sasanilerde çıkan Mazdek İsyanı'nın bastırılmasında önemli rol oynayan Türk devleti hangisidir?", "Akhunlar (Akkoyunlular)", "İslamiyet Öncesi Türk Tarihi"),
    Flashcard("'Oğuz' kelimesinin kelime anlamı nedir?", "Boy, kabile veya kalabalık", "İslamiyet Öncesi Türk Tarihi"),

    Flashcard("Türk devletlerinin geleneksel teşkilatında yer alan devletin dört unsuru nelerdir?", "Bağımsızlık, ülke, halk, teşkilat", "İslamiyet Öncesi Türk Tarihi"),
    Flashcard("Gök Tanrı tarafından hükümdara verildiğine inanılan kut, küç ve ülüş kavramlarının anlamları nelerdir?", "Kut siyasi güç, küç askeri yetki, ülüş ekonomi", "İslamiyet Öncesi Türk Tarihi"),
    Flashcard("Türk devletlerinde devletin sürekliliğini sağlamak için uygulanan üç temel politika nedir?", "Türk Cihan Hakimiyeti, Nizam-ı Alem, Kızıl Elma", "İslamiyet Öncesi Türk Tarihi"),
    Flashcard("İslamiyet öncesi Türk devletlerinde ülkenin doğu ve batı olmak üzere ikiye ayrılarak yönetilmesine ne ad verilir ve bu ilk kez hangi devlette uygulanmıştır?", "İkili teşkilat, Asya Hun Devleti", "İslamiyet Öncesi Türk Tarihi"),
    Flashcard("İslamiyet öncesi Türk devletlerinde geçen aygucu, ayuki, buyruk, tigin, inanç/inal/ataman ve şad kavramlarının anlamları nelerdir?", "Aygucu vezir, ayuki hükümet, buyruk bakan, tigin hükümdarın oğlu, inanç/inal/ataman tigin eğitmeni, şad hanedan üyesi komutan", "İslamiyet Öncesi Türk Tarihi"),

    Flashcard("Eski Türklerde yuğ, kurgan, balbal, tamu, uçmağ, kült ve kam kavramlarının anlamları nelerdir?", "Yuğ cenaze töreni, kurgan mezar, balbal mezar taşı, tamu cehennem, uçmağ cennet, kült inanış, kam din adamı", "İslamiyet Öncesi Türk Tarihi"),
    Flashcard("Türk edebiyatının bilinen ilk yazılı metin eseri hangisidir ve nerede bulunur?", "Orhun Abideleri, Moğolistan", "İslamiyet Öncesi Türk Tarihi"),
    Flashcard("Orhun Abideleri hangi yazı çeşidiyle yazılmıştır ve bu yazıyı çözen filolog kimdir?", "Runik yazı, W. Thomsen", "İslamiyet Öncesi Türk Tarihi"),
    Flashcard("Orhun Abideleri kimler adına dikilmiştir?", "Tonyukuk, Kül Tigin, Bilge Kağan", "İslamiyet Öncesi Türk Tarihi"),
    Flashcard("İlk Türk tarihçisi ve yazarı kimdir ve kendi anısını kim yazmıştır?", "Vezir Tonyukuk, kendi anısını kendisi yazmıştır", "İslamiyet Öncesi Türk Tarihi"),

    // --- İlk Türk İslam Devletleri ---
        Flashcard("İslamiyeti kabul eden ilk Türk devleti hangisidir?", "Karahanlılar", "İlk Türk İslam Devletleri"),
        Flashcard("Türk-İslam mimarisinin ilk örneklerini veren devlet hangisidir?", "Karahanlılar", "İlk Türk İslam Devletleri"),
        Flashcard("Gazneli Devleti'ni asıl güçlendiren hükümdar kimdir?", "Gazneli Mahmud", "İlk Türk İslam Devletleri"),
        Flashcard("'Sultan' unvanını ilk kullanan Türk hükümdar kimdir?", "Gazneli Mahmud", "İlk Türk İslam Devletleri"),
        Flashcard("Kutadgu Bilig kim tarafından yazılmıştır?", "Yusuf Has Hacip", "İlk Türk İslam Devletleri"),
        Flashcard("Divan-ı Lügati't Türk'ün yazarı kimdir?", "Kaşgarlı Mahmud", "İlk Türk İslam Devletleri"),

        // --- Türkiye Selçuklu Devleti ---
        Flashcard("Malazgirt Savaşı hangi yıl yapılmıştır?", "1071", "Türkiye Selçuklu Devleti"),
        Flashcard("Malazgirt Savaşı'nı kazanan Selçuklu Sultanı kimdir?", "Sultan Alparslan", "Türkiye Selçuklu Devleti"),
        Flashcard("Türkiye Selçuklu Devleti'nin kurucusu kimdir?", "Süleyman Şah (I. Kutalmışoğlu Süleyman Şah)", "Türkiye Selçuklu Devleti"),
        Flashcard("Türkiye Selçuklu Devleti'nin ilk başkenti neresidir?", "İznik", "Türkiye Selçuklu Devleti"),
        Flashcard("Kösedağ Savaşı kime karşı, ne zaman yapılmıştır?", "Moğollara karşı, 1243", "Türkiye Selçuklu Devleti"),
        Flashcard("Türkiye Selçuklu Devleti hangi olayla yıkılma sürecine girmiştir?", "Kösedağ Savaşı yenilgisi", "Türkiye Selçuklu Devleti"),

        // --- Osmanlı Kuruluş Dönemi ---
        Flashcard("Osmanlı Devleti'ni kim, ne zaman kurmuştur?", "Osman Bey, 1299", "Osmanlı Kuruluş Dönemi"),
        Flashcard("Osmanlıların Rumeli'ye ilk geçişi hangi olayla olmuştur?", "Çimpe Kalesi'nin alınması (Orhan Bey dönemi)", "Osmanlı Kuruluş Dönemi"),
        Flashcard("Yeniçeri Ocağı hangi padişah döneminde kurulmuştur?", "I. Murad (çalışmalar Orhan Bey döneminde başlamıştır)", "Osmanlı Kuruluş Dönemi"),
        Flashcard("Ankara Savaşı kimlerle, hangi yıl yapılmıştır?", "Timur ile Yıldırım Bayezid arasında, 1402", "Osmanlı Kuruluş Dönemi"),
        Flashcard("Ankara Savaşı'ndan sonra başlayan sürece ne ad verilir?", "Fetret Devri", "Osmanlı Kuruluş Dönemi"),
        Flashcard("İstanbul'u fetheden padişah kimdir?", "II. Mehmed (Fatih Sultan Mehmed)", "Osmanlı Kuruluş Dönemi"),

        // --- Osmanlı Yükselme Dönemi ---
        Flashcard("İstanbul hangi yıl fethedilmiştir?", "1453", "Osmanlı Yükselme Dönemi"),
        Flashcard("Mısır Seferi ile Osmanlı hangi unvanı almıştır?", "Halifelik", "Osmanlı Yükselme Dönemi"),
        Flashcard("Kanuni Sultan Süleyman döneminde çıkarılan kanunnameye ne ad verilir?", "Kanunname-i Ali Osman", "Osmanlı Yükselme Dönemi"),
        Flashcard("Preveze Deniz Savaşı hangi yıl kazanılmıştır?", "1538", "Osmanlı Yükselme Dönemi"),
        Flashcard("Mohaç Meydan Savaşı hangi ülkeye karşı yapılmıştır?", "Macaristan", "Osmanlı Yükselme Dönemi"),
        Flashcard("Kanuni Sultan Süleyman döneminde yapılan kuşatma hangisidir?", "Birinci Viyana Kuşatması (1529)", "Osmanlı Yükselme Dönemi")
    )
}
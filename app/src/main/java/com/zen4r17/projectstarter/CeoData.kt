package com.zen4r17.projectstarter

object CeoData {

    private val ceoNames = arrayOf(
        "Steve Jobs",
        "Jeff Bezos",
        "Bill Gates",
        "Warren Buffet",
        "Jack Ma",
        "Sundar Pichai",
        "Larry Page",
        "Tim Cook",
        "Satya Nadella",
        "Indra Nooyi"
    )

    private val ceoDetails = arrayOf(
        "A college dropout, Steve Jobs, went on to be regarded as the Father of the Digital World. The founder/co-founder of Apple Inc, Pixar Animation Studios and NeXT Inc was a passionate visionary who was responsible for the development of iMac, iPod, iTunes, iPad and the iPhone which ushered in a new era in the computer, music and film industries.",
        "The founder and CEO of the multi-national technology company Amazon, Jeff Bezos is the wealthiest man in the world. Jeff, who left his lucrative job at an investment firm to fulfil his entrepreneurial ambition, also owns the newspaper, The Washington Post, and its affiliate publications along with a spaceflight company, Blue Origin.",
        "Leading American technologist, business leader and philanthropist, Bill Gates is the co-founder of the world’s largest software company, Microsoft. His passion for computers made him one of the richest in the world and through his charity foundation, Bill & Melinda Gates Foundation, he and his ex-wife, Melinda, use this money generously to help people world over live a better life.",
        "American investor, business tycoon and philanthropist Warren Buffett is considered one of the most successful investors in the world by the media. The chairman and largest shareholder of the firm, Berkshire Hathaway, he is often called as the ‘Oracle’ or ‘Sage’ of Omaha. Notably, he has pledged to give away a sizable portion of his wealth to philanthropic causes.",
        "Jack Ma’s journey from being a tourist guide to establishing the Chinese e-commerce conglomerate Alibaba is inspirational. Initially rejected by various companies, he is the second-wealthiest person in China as of 2020. After quitting his post of executive chairman of Alibaba in 2019, he focused on philanthropy and environmental causes.",
        "Sundar Pichai is the CEO of Google and its parent company Alphabet Inc. An alumnus of IIT, Stanford and Wharton, Pichai has come a long way, from innovating Google’s products such as Chrome, Google Drive and Google Apps to leading the software giant and being one of the most sought-after names in the tech industry.",
        "Larry Page is an American Internet entrepreneur and computer scientist. As one of the co-founders of the multinational technology company Google, Larry Page effectively changed the way the world functions today as Google is a synonym for a search engine in many parts of the world. Unsurprisingly, he became a billionaire after co-founding Google.",
        "Since taking over as the CEO of Apple, Inc. in 2011, till 2020, Tim Cook has, through his dedication, doubled its profits. He was the first Fortune 500 CEO to “come out” as gay, in 2014. A devoted philanthropist, Tim intends to donate most of his stocks to charity.",
        "Satya Nadella is an Indian-American business executive, currently serving as the chief executive officer of Microsoft. Since he became CEO, the company has seen a 27% annual growth rate. Born in India to a Telugu-speaking family, Nadella serves as an inspiration to millions of Indians who nurse 'The American Dream'.",
        "Indra Nooyi is an Indian-American business executive known for her association with PepsiCo where she served as the chief executive officer from 2006 to 2018. Often ranked among the most powerful women, Nooyi was named in Forbes' World's 100 Most Powerful Women list in 2014. In 2017, she was named in the magazine's 19 Most Powerful Women in Business list."
    )

    private val ceoImages = arrayOf(
        R.drawable.steve_jobs1,
        R.drawable.jeff_bezos2,
        R.drawable.bill_gates3,
        R.drawable.warren_buffet4,
        R.drawable.jack_ma5,
        R.drawable.sundar_pichai6,
        R.drawable.larry_page7,
        R.drawable.tim_cook8,
        R.drawable.satya_nadella9,
        R.drawable.indra_nooyi10,
    )

    val listData: ArrayList<CEO>
        get() {

            val list = arrayListOf<CEO>()

            for (position in ceoNames.indices) {
                val listCeo = CEO()
                listCeo.name = ceoNames[position]
                listCeo.detail = ceoDetails[position]
                listCeo.photo = ceoImages[position]
                list.add(listCeo)
            }
            return list
        }
}
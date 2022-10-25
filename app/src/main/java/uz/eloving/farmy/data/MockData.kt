package uz.eloving.farmy.data

import android.content.Context
import uz.eloving.farmy.R
import uz.eloving.farmy.model.JobModule
import uz.eloving.farmy.model.UIModule

class MockData {
    companion object {
        val data = arrayListOf(
            UIModule(
                "O'simligingiz kasalligini aniqlayolmayapsizmi ? ", R.raw.save_nature,
                "Bizga o'simlik rasmini yuklang, biz esa sizga undagi kasallikni " +
                        "aniqlashga yordam beramiz !",
                false
            ),
            UIModule(
                "Sotish va sotib olishda shaffoflik qidiryapsizmi ?", R.raw.sell_and_buy,
                "Biz sizga mevalardan tortib poliz ekinlarigacha oson sotish va sotib " +
                        "olishni taklif qilamiz !",
                false
            ),
            UIModule(
                "Ish topish yoki ishchi qidirshda muommo bormi ? ", R.raw.search_for_job,
                "Biz orqali o'zingizga oson ish va ishchi toping. Ishchilar va ish " +
                        "beruvchilar uchun eng afzal yechim — Farmy",
                true
            )
        )


        fun getConstants(context: Context): ArrayList<JobModule> {
            val jobs = ArrayList<JobModule>()
            jobs.add(JobModule(1,"All"))
            jobs.add(JobModule(2,"Dehqon"))
            jobs.add(JobModule(4,"Bogbon"))
            jobs.add(JobModule(5,"Bogbon"))
            jobs.add(JobModule(6,"Bogbon"))
            jobs.add(JobModule(7,"Bogbon"))
            jobs.add(JobModule(8,"Bogbon"))

            return jobs
        }

//        fun getInfoEmployees(context: Context){
//            val info=ArrayList<>
//        }


    }


}
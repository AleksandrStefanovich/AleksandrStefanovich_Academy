package by.academy.HomeWork8;

        import java.util.HashMap;
        import java.util.Map;
        import java.util.regex.Matcher;
        import java.util.regex.Pattern;

public class RegexMain3 {
    public static void main(String[] args) {
        String urls =
                "http://www.obrnadzor.gov.ru"+
                        "https://stat.edu.ru"+
                        "https://www.fipi.ru"+
                        "https://www.lexed.ru"+
                        "https://www.ru"+
                        "https://www.edu.ru"+
                        "https://ege.edu.ru"+
                        "https://www.ecsocman.edu.ru"+
                        "https://www.law.edu.ru"+
                        "https://www.stavminobr.ru"+
                        "https://www.minomos.ru"+
                        "https://www.minobraz.ru"+
                        "https://www.edunso.ru"+
                        "https://www.educom.ru"+
                        "https://www.avorontcov.ru"+
                        "https://bogoslovie.pro/"+
                        "https://www.vlgregedu.ru"+
                        "https://www.baikalnarobraz.ru"+
                        "https://www.websib.ru"+
                        "https://www.edu.murmansk.ru"+
                        "https://www.eduhmao.ru"+
                        "https://www.omsk.edu.ru"+
                        "https://webinar.pgsga.ru"+
                        "https://www.edukbr.ru"+
                        "https://www.stavedu.ru"+
                        "https://abc.edu-net.khb.ru"+
                        "https://www.edu.yar.ru"+
                        "https://iso.karelia.ru"+
                        "https://imc.ocpi.ru"+
                        "https://www.ug.ru"+
                        "https://www.vestniknews.ru"+
                        "https://www.elw.ru"+
                        "https://vio.fio.ru"+
                        "https://www.eidos.ru"+
                        "https://news.abiturcenter.ru"+
                        "https://kvant.mccme.ru"+
                        "https://www.psyedu.ru"+
                        "https://www.akademkniga.ru"+
                        "https://www.lbz.ru"+
                        "https://www.verbum-m.ru"+
                        "https://www.vlados.ru"+
                        "https://www.mnemozina.ru"+
                        "https://www.msbook.ru"+
                        "https://www.infojournal.ru"+
                        "https://www.onyx.ru"+
                        "https://www.prosv.ru"+
                        "https://www.direktor.ru"+
                        "https://www.titul.ru"+
                        "https://www.uchebniki.ru"+
                        "https://www.edu-expo.ru"+
                        "https://www.ito.su"+
                        "https://www.relarn.ru"+
                        "https://www.mce.biophys.msu.ru"+
                        "https://www.edu-it.ru"+
                        "https://www.znanie.info"+
                        "https://www.it-education.ru"+
                        "https://eidos.ru"+
                        "https://konkurs.lgo.ru"+
                        "https://teacher.org.ru"+
                        "https://www.iicavers.ru"+
                        "https://www.prometeus.ru"+
                        "https://www.learnware.ru"+
                        "https://www.e-osnova.ru"+
                        "https://www.websoft.ru"+
                        "https://online.multilex.ru"+
                        "https://www.slovari.ru"+
                        "https://www.glossary.ru"+
                        "https://www.krugosvet.ru"+
                        "https://www.elementy.ru"+
                        "https://www.sokr.ru"+
                        "https://www.vestniknews.ru"+
                        "https://www.eurekanet.ru"+
                        "https://www.kpmo.ru"+
                        "https://www.iteach.ru"+
                        "https://mou.bsu.edu.ru"+
                        "https://www.profile-edu.ru"+
                        "https://www.setilab.ru"+
                        "https://www.boards-edu.ru"+
                        "https://www.teachpro.ru"+
                        "https://oso.rcsz.ru"+
                        "https://www.eidos.ru"+
                        "https://ege.edu.ru"+
                        "https://www.egesakha.ru"+
                        "https://basicenglish.ru"+
                        "https://philosophiya.ru"+
                        "https://www.rcoi.net"+
                        "https://www.irro.ru"+
                        "https://www.ed.vseved.ru"+
                        "https://www.znania.ru"+
                        "https://www.detiplus.ru"+
                        "https://www.obrazovan.ru"+
                        "https://www.abiturcenter.ru"+
                        "https://www.moscow-high.ru"+
                        "https://www.astronet.ru"+
                        "https://www.astrolab.ru"+
                        "https://heritage.sai.msu.ru"+
                        "https://www.m31.spb.ru"+
                        "https://www.astro.websib.ru"+
                        "https://www.space.vsi.ru"+
                        "https://www.meteorite.narod.ru"+
                        "https://moscowaleks.narod.ru"+
                        "https://www.allplanets.ru"+
                        "https://www.galspace.spb.ru"+
                        "https://school.astro.spbu.ru"+
                        "https://www.astrolib.ru"+
                        "https://www.biodat.ru"+
                        "https://www.floranimal.ru"+
                        "https://www.kozlenkoa.narod.ru"+
                        "https://www.biodan.narod.ru"+
                        "https://www.biolog188.narod.ru"+
                        "https://www.livt.net"+
                        "https://learnbiology.narod.ru"+
                        "https://med.claw.ru"+
                        "https://www.palaeoentomolog.ru"+
                        "https://evolution.powernet.ru"+
                        "https://www.geosite.com.ru"+
                        "https://www.rgo.ru"+
                        "https://www.geografia.ru"+
                        "https://geo-tur.narod.ru"+
                        "https://uroki5.ru"+
                        "https://www.karty.narod.ru"+
                        "https://www.terrus.ru"+
                        "https://afromberg.narod.ru"+
                        "https://geo.metodist.ru"+
                        "https://www.abc-english-grammar.com"+
                        "https://www.fluent-english.ru"+
                        "https://www.englishclub.narod.ru"+
                        "https://lib.ru"+
                        "https://englishaz.narod.ru"+
                        "https://kinder-english.narod.ru"+
                        "https://lessons.study.ru"+
                        "https://uztranslations.net.ru"+
                        "https://clubfr.narod.ru"+
                        "https://www.toefl.ru"+
                        "https://teach-learn.narod.ru"+
                        "https://www.vzmakh.ru"+
                        "https://www.computer-museum.ru"+
                        "https://comp-science.narod.ru"+
                        "https://lib.ru"+
                        "https://infoschool.narod.ru"+
                        "https://book.kbsu.ru"+
                        "https://trushinov.chat.ru"+
                        "https://www.nethistory.ru"+
                        "https://www.edu-it.ru"+
                        "https://ekochelaeva.narod.ru"+
                        "https://www.child.ru"+
                        "https://www.botik.ru"+
                        "https://www.citforum.ru"+
                        "https://www.sinf2000.narod.ru"+
                        "https://inppt.ru"+
                        "https://pofizike.ru"+
                        "https://algolist.manual.ru"+
                        "https://acm.timus.ru"+
                        "https://inform-school.narod.ru"+
                        "https://algorithm.narod.ru"+
                        "https://www.mathprog.narod.ru"+
                        "https://www.olympiads.ru"+
                        "https://cyber-net.spb.ru"+
                        "https://neerc.ifmo.ru"+
                        "https://tests.academy.ru"+
                        "https://www.junior.ru"+
                        "https://www.ecdl.ru"+
                        "https://pobeda.mosreg.ru"+
                        "https://glory.rin.ru"+
                        "https://www.1941-1945.ru"+
                        "https://decemb.hobby.ru"+
                        "https://www.warheroes.ru"+
                        "https://www.moscowkremlin.ru"+
                        "https://blokada.otrok.ru"+
                        "https://www.praviteli.org"+
                        "https://www.rkka.ru"+
                        "https://battle.volgadmin.ru"+
                        "https://www.oldgazette.ru"+
                        "https://www.biografia.ru"+
                        "https://www.worldhist.ru"+
                        "https://www.1939-1945.net"+
                        "https://www.ellada.spb.ru"+
                        "https://www.ancienthistory.spb.ru"+
                        "https://lesson-history.narod.ru"+
                        "https://www.hrono.ru"+
                        "https://www.bibliogid.ru"+
                        "https://www.likt590.ru"+
                        "https://skolakras.narod.ru"+
                        "https://www.foxdesign.ru"+
                        "https://edu-mipt.ru"+
                        "https://likhachev.lfond.spb.ru"+
                        "https://www.gercen.net.ru"+
                        "https://www.dobrolyubov.net.ru"+
                        "https://www.kuprin.org.ru"+
                        "https://www.aleksandrpushkin.net.ru"+
                        "https://www.saltykov.net.ru"+
                        "https://www.antonchehov.org.ru"+
                        "https://www.math.ru"+
                        "https://www.mccme.ru"+
                        "https://www.allmath.ru"+
                        "https://eqworld.ipmnet.ru"+
                        "https://graphfunk.narod.ru"+
                        "https://comp-science.narod.ru"+
                        "https://www.problems.ru"+
                        "https://www.etudes.ru"+
                        "https://www.mathtest.ru"+
                        "https://school.msu.ru"+
                        "https://www.mathprog.narod.ru"+
                        "https://methmath.chat.ru"+
                        "https://olympiads.mccme.ru"+
                        "https://www.mathnet.spb.ru"+
                        "https://www.ru"+
                        "https://www.museum.ru"+
                        "https://www.world-art.ru"+
                        "https://petrov-gallery.narod.ru"+
                        "https://www.museum-online.ru"+
                        "https://www.tretyakov.ru"+
                        "https://www.impressionism.ru"+
                        "https://www.arthistory.ru"+
                        "https://www.moscowkremlin.ru"+
                        "https://www.cbook.ru"+
                        "https://www.ilyarepin.org.ru"+
                        "https://www.encspb.ru"+
                        "https://www.gov.ru"+
                        "https://www.president.kremlin.ru"+
                        "https://economicus.ru"+
                        "https://econom.nsc.ru"+
                        "https://www.economics.ru"+
                        "https://hsemacro.narod.ru"+
                        "https://danur-w.narod.ru"+
                        "https://www.hro.org"+
                        "https://www.seprava.ru"+
                        "https://afromberg.narod.ru"+
                        "https://english-and-home.ru"+
                        "https://www.mapryal.org"+
                        "https://www.ru"+
                        "https://www.ru"+
                        "https://www.ropryal.ru"+
                        "https://www.ivki.ru"+
                        "https://slovesnik-oka.narod.ru"+
                        "https://your-english.ru"+
                        "https://www.school.mipt.ru"+
                        "https://kvant.mccme.ru"+
                        "https://ifilip.narod.ru"+
                        "https://www.decoder.ru"+
                        "https://www.phys.spb.ru"+
                        "https://www.relativity.ru"+
                        "https://physics03.narod.ru"+
                        "https://physicomp.lipetsk.ru"+
                        "https://www.elementy.ru"+
                        "https://nuclphys.sinp.msu.ru"+
                        "https://www.hemi.nsu.ru"+
                        "https://belok-s.narod.ru"+
                        "https://maratakm.narod.ru"+
                        "https://www.fcpolimp.ru"+
                        "https://www.lingvocat.com"+
                        "https://all-met.narod.ru"+
                        "https://rushim.ru"+
                        "https://ege.karelia.ru"+
                        "https://www.4egena100.info"+
                        "https://www.udmedu.ru"+
                        "https://www.sinncom.ru"+
                        "https://www.beluno.ru"+
                        "https://www.rost.ru"+
                        "https://stat.edu.ru"+
                        "https://www.informika.ru"+
                        "https://www.fipi.ru"+
                        "https://www.lexed.ru"+
                        "https://www.ru"+
                        "https://www.orenport.ru"+
                        "https://www.infojournal.ru"+
                        "https://www.academia-moscow.ru"+
                        "https://www.aspectpress.ru"+
                        "https://www.astpress-shkola.ru"+
                        "https://www.ass21vek.ru"+
                        "https://www.vaco.ru"+
                        "https://www.vesmirbooks.ru"+
                        "https://www.knigi-psychologia.com"+
                        "https://www.dashkov.ru"+
                        "https://www.drofa-sever.spb.ru"+
                        "https://www.karapuz.com"+
                        "https://www.karo.spb.ru"+
                        "https://linka-press.ru"+
                        "https://www.linguamedia.ru"+
                        "https://www.martdon.ru"+
                        "https://www.newwave.msk.ru"+
                        "https://www.axis.ru"+
                        "https://www.ucpva.ru"+
                        "https://www.sup99.ru"+
                        "https://www.speclit.spb.ru"+
                        "https://abiturcenter.ru"+
                        "https://www.ecolife.ru"+
                        "https://www.dnevnik.ru"+
                        "https://www.phoenixrostov.ru"+
                        "https://www.flinta.ru"+
                        "https://www.yantskaz.ru"+
                        "https://www.ru"+
                        "https://www.enas.ru"+
                        "http://www.4-pu.ru"+
                        "http://vernadsky.info"+
                        "http://kvant.info/"+
                        "http://teachpro.ru"+
                        "http://akademius.narod.ru"+
                        "http://www.astrotop.ru"+
                        "http://www.astro.spbu.ru"+
                        "http://www.astro.websib.ru"+
                        "http://spacelife.narod.ru"+
                        "http://www.meteorite.narod.ru"+
                        "http://www.kosmofizika.ru"+
                        "http://www.abitura.com"+
                        "http://www.math.ru"+
                        "http://www.mathnet.ru"+
                        "http://ilib.mccme.ru"+
                        "http://matematiku.ru"+
                        "http://www.shevkin.ru"+
                        "http://mat-game.narod.ru"+
                        "http://kvant.mccme.ru"+
                        "http://math.child.ru"+
                        "http://muravin2007.narod.ru"+
                        "http://sbiryukova.narod.ru"+
                        "http://www.pms.ru"+
                        "http://www.cnso.ru"+
                        "http://www.mathprog.narod.ru"+
                        "http://kpolyakov.narod.ru"+
                        "http://psbatishev.narod.ru"+
                        "http://comp-science.narod.ru"+
                        "http://prohod.org"+
                        "http://belok-s.narod.ru"+
                        "http://biolka.narod.ru"+
                        "http://bioword.narod.ru"+
                        "http://learnbiology.narod.ru"+
                        "http://darvinskiy.ru"+
                        "http://www.dinosaur.ru"+
                        "http://www.bigarctic.ru"+
                        "http://zelenyshluz.narod.ru"+
                        "http://zooex.baikal.ru"+
                        "http://www.filin.vn.ua/"+
                        "http://www.gepard.org/"+
                        "http://dronisimo.chat.ru"+
                        "http://www.anofdi.narod.ru"+
                        "http://www.deserts.narod.ru"+
                        "http://www.oopt.info/"+
                        "http://paleobase.narod.ru"+
                        "http://www.danki.ru"+
                        "http://caelifera.narod.ru"+
                        "http://www.biodiversity.ru"+
                        "http://www.ecolife.ru"+
                        "http://www.sci.aha.ru"+
                        "http://www.abc.chemistry.bsu.by"+
                        "http://classchem.narod.ru"+
                        "http://n-t.ru"+
                        "http://chemfiles.narod.ru"+
                        "http://www.physchem.chimfak.rsu.ru"+
                        "http://www.chemport.ru"+
                        "http://www.himhelp.ru"+
                        "http://atlantida.agava.ru"+
                        "http://geo.web.ru"+
                        "http://soils.narod.ru"+
                        "http://www.meteoweb.ru"+
                        "http://www.outdoors.ru"+
                        "http://iklarin.narod.ru"+
                        "http://www.myplanet-earth.com/"+
                        "http://katastroffi.narod.ru"+
                        "http://spelestology.narod.ru"+
                        "http://chronicl.chat.ru"+
                        "http://www.dnttm.ru"+
                        "http://www.dm-centre.ru"+
                        "http://www.dtdm.tomsk.ru"+
                        "http://www.pioner-samara.ru"+
                        "http://geoschool.web.ru"+
                        "http://www.vvaschool.spb.ru"+
                        "http://www.ecostudio.ru"+
                        "http://www.school.mipt.ru"+
                        "http://www.mgsun.ru"+
                        "http://www.ku-obr.ru"+
                        "http://www.child.ru"+
                        "http://www.ru"+
                        "http://www.komobr46.ru"+
                        "http://phys.problems.ru"+
                        "http://www.cdrm.ru"+
                        "http://www.abiturcenter.ru"+
                        "http://www.phtc.ru"+
                        "http://www.cvr-mitino.ru"+
                        "http://www.pilot-club.ru"+
                        "http://www.eidos.ru"+
                        "http://www.desc.ru"+
                        "http://www.mccme.ru"+
                        "http://moseco.narod.ru"+
                        "http://schoolkey.onego.ru"+
                        "http://yas.pl.ru"+
                        "http://www.edu.yar.ru"+
                        "http://www.svb-ffm.narod.ru"+
                        "http://www.magmouse.ru"+
                        "http://www.eduland.ru"+
                        "http://ipo.spb.ru"+
                        "http://www.rm.kirov.ru"+
                        "http://vernadsky.info"+
                        "http://konkurs.lgo.ru"+
                        "http://www.olympiads.ru"+
                        "http://neerc.ifmo.ru"+
                        "http://www.cyber-net.spb.ru"+
                        "http://physolymp.spb.ru"+
                        "http://olympiads.mccme.ru"+
                        "http://www.museum.ru"+
                        "http://www.tretyakovgallery.ru"+
                        "http://www.hermitage.ru"+
                        "http://www.kreml.ru"+
                        "http://www.cathedral.ru"+
                        "http://www.ethnomuseum.ru"+
                        "http://www.juniware.ru"+
                        "http://www.klsh.ru"+
                        "http://www.lmsh.ru"+
                        "http://www.nortland.ru"+
                        "http://www.mccme.ru"+
                        "http://www.artek.org"+
                        "http://www.fizlesh.ru"+
                        "http://www.gmsib.ru"+
                        "http://www.gimn6.ru"+
                        "http://blockly.ru"+
                        "http://sc64.ucoz.ru"+
                        "http://www.gymnasium99.ru"+
                        "http://www.gym1517.ru"+
                        "http://www.gogi1516.ru"+
                        "http://www.zemgym.ru"+
                        "http://www.kpml.ru"+
                        "http://lyceum1.perm.ru"+
                        "http://www.1511.ru"+
                        "http://www.lien.ru"+
                        "http://www.school.ioffe.ru"+
                        "http://www.1543.ru"+
                        "http://www.school-1.ru"+
                        "http://www.gymnasia-radonezh.ru"+
                        "http://www.pms.ru"+
                        "http://www.nanomil.ru"+
                        "http://www.lic36.narod.ru"+
                        "http://www.1580.ru"+
                        "http://www.mhs548.ru"+
                        "http://www.prioritet-school.ru"+
                        "http://g1522.msk.ru"+
                        "http://chinese-school11.msk.ru"+
                        "http://www.chuvbook.ru"+
                        "http://www.infojournal.ru"+
                        "http://www.ecolife.ru"+
                        "http://www.textbook.ru"+
                        "http://www.altaydon.ru"+
                        "http://www.ckbib.ru"+
                        "http://www.abiturcenter.ru"+
                        "http://www.book.ru"+
                        "http://www.licey-kniga.ru"+
                        "http://www.master-kniga.ru"+
                        "http://www.moscowbooks.ru"+
                        "http://www.mdk-arbat.ru"+
                        "http://www.obrazpro.ru"+
                        "http://www.td-shkolnik.com"+
                        "http://booksshop.ru"+
                        "http://www.mistral.ru"+
                        "http://my-shop.ru"+
                        "http://www.vashakniga.ru"+
                        "http://litera.by"+
                        "http://www.ru"+
                        "http://www.slovobook.ru"+
                        "http://www.bookler.ru"+
                        "http://www.findbook.ru"+
                        "http://ruthenia.ru"+
                        "http://www.slovari.ru"+
                        "http://www.artint.ru"+
                        "http://vasmer.narod.ru"+
                        "http://www.aot.ru"+
                        "http://www.blues.ru"+
                        "http://dop.ui-miit.ru"+
                        "http://www.philol.msu.ru"+
                        "http://www.rm.kirov.ru"+
                        "http://www.ed-today.ru"+
                        "http://uhtk59.ru"+
                        "http://www.stengazeta.net"+
                        "http://evartist.narod.ru"+
                        "http://www.gramota.ru"+
                        "http://bukinist.agava.ru"+
                        "http://www.zorich.ru"+
                        "http://levin.rinet.ru"+
                        "http://www.kivinov.ru"+
                        "http://www.akonstantinov.spb.ru"+
                        "http://www.akunin.ru"+
                        "http://www.frei.ru"+
                        "http://www.fa.ru"+
                        "http://www.vavilon.ru"+
                        "http://www.pereplet.ru"+
                        "http://otblesk.com/vysotsky"+
                        "http://br00.narod.ru"+
                        "http://www.crea.ru"+
                        "http://mndlstam.chat.ru"+
                        "http://malinsk.narod.ru"+
                        "http://www.poezia.ru"+
                        "http://www.ru"+
                        "http://www.yabloko.ru"+
                        "http://www.loc.gov/index.html"+
                        "http://www.zeitungen.de"+
                        "http://www.eslcafe.com/"+
                        "http://www.reward.ru"+
                        "http://lessons.study.ru"+
                        "http://www.unil.ch/fra"+
                        "http://www.fokus.msn.de"+
                        "http://www.smirnova.net/"+
                        "http://www.virtualfreesites.com/world.travel.html"+
                        "http://www.classical.ru"+
                        "http://www.abcgallery.com/"+
                        "http://dop-obrazovanie.com/"+
                        "http://www.cnso.ru"+
                        "http://www.smallbay.ru"+
                        "http://kizhi.karelia.ru"+
                        "http://m-buanarroti.narod.ru"+
                        "http://www.bards.ru"+
                        "http://www.fondcultura.ru"+
                        "http://www.varvar.ru"+
                        "http://www.picturesrembrandt.org/"+
                        "http://omu.ru"+
                        "http://www.memo.ru"+
                        "http://www.museum.ru"+
                        "http://www.pish.ru"+
                        "http://schoolart.narod.ru"+
                        "http://www.koob.ru"+
                        "http://www.childsoc.ru"+
                        "http://www.supcourt.ru"+
                        "http://genproc.gov.ru"+
                        "http://www.ug.ru"+
                        "http://www.hrights.ru"+
                        "http://www.akdi.ru"+
                        "http://www.akdi.ru"+
                        "http://www.akdi.ru"+
                        "http://www.memo.ru"+
                        "http://www.childsoc.ru"+
                        "http://vshdo.ru"+
                        "http://www.zonaprav.ru"+
                        "http://www.parlament-club.ru"+
                        "http://www.praviteli.org"+
                        "http://pravosoznanie.chel.org/"+
                        "http://www.prodemo.ru"+
                        "http://www.ug.ru"+
                        "http://www.cikrf.ru"+
                        "http://urfak.petrsu.ru"+
                        "http://www.president.kremlin.ru"+
                        "http://www.gov.ru"+
                        "http://www.mid.ru"+
                        "http://www.fas.gov.ru"+
                        "http://www.fss.ru"+
                        "http://www.wto.ru"+
                        "http://www.zonaprav.ru"+
                        "http://www.cbr.ru"+
                        "http://www.chemfive.ru"+
                        "http://www.akdi.ru"+
                        "http://www.rbc.ru"+
                        "http://www.yellowpagesrussia.ru"+
                        "http://www.lib.ru"+
                        "http://www.hist.msu.ru"+
                        "http://virlib.eunnet.net"+
                        "http://www.cbook.ru"+
                        "http://www.sci.aha.ru"+
                        "http://www.ymk.ru"+
                        "http://www.cosmoschool.ru"+
                        "http://www.khspu.ru"+
                        "http://rsa.iso.karelia.ru"+
                        "http://zaochn.mccme.ru"+
                        "http://edutula.ru"+
                        "http://sms-informator.ru"+
                        "http://schoolmit.ru"+
                        "http://uisrussia.msu.ru"+
                        "http://kam-edu.ru"+
                        "http://englishpost.ru"+
                        "http://www.obe.ru"+
                        "http://socobraz.ru"+
                        "http://www.kyshtovgrad.ru"+
                        "http://realstudy.ru"+
                        "http://romanova-school.ru"+
                        "http://www.e-parta.ru"+
                        "http://langbridge.ru"+
                        "http://www.tegec.ru"+
                        "http://www.prodoski.ru"+
                        "http://pl74.net"+
                        "http://accounts.google.com"+
                        "http://www.academkin.ru"+
                        "http://sokolova-aa.ru"+
                        "http://Lelang.ru"+
                        "http://www.statgrad.org"+
                        "http://babla.ru"+
                        "http://tutorweb.ru"+
                        "http://math.hashcode.ru"+
                        "http://www.piligrim.com/"+
                        "http://cdt.gidrotorf.org"+
                        "http://www.toonto.ru"+
                        "http://www.junradio.com"+
                        "http://ouhmao.ru"+
                        "ftp://poluroka.ru"+
                        "ftp://english-mania.ru"+
                        "ftp://xn----7sbbtociiwedaloc9a2a7bv2n.xn--p1ai/"+
                        "ftp://www.spaces.ru"+
                        "ftp://www.erudyt.ru"+
                        "ftp://www.fipi.ru"+
                        "ftp://epicon.ru"+
                        "ftp://www.linguahouse.ru"+
                        "ftp://zvzd3d.ru"+
                        "ftp://www.shelk-put.com"+
                        "ftp://testmath.ru"+
                        "ftp://reword.org"+
                        "ftp://www.ed.vseved.ru"+
                        "ftp://prutzkow.com/numbers/"+
                        "ftp://www.reg.ru"+
                        "ftp://cleve.ru"+
                        "ftp://1sg.ru"+
                        "ftp://water-rf.ru"+
                        "ftp://lang-land.com/";

        String protocol = "((http)|(https)|(ftp))";         //group 1/2/3/4
        String domain ="((ru)|(su)|(com)|(org)|" +          //group 7/8/9/10/11
                "(de)|(net)|(xn--p1ai/)|(pro)|" +           //group 12/13/14/15
                "(info)|(ua)|(by)|(html)|(ch)|(fra))";      //group 16/17/18/19/20/21

        Pattern pattern = Pattern.compile(protocol + "(://)(\\S+?\\.)+?" + domain);//group 5/6
        Matcher matcher = pattern.matcher(urls);

        String[] domainNames = new String[]{"ru","su","com","org","de","net","xn--p1ai/","pro","info","ua","by","html","ch","fra"};
        String[] protocolNames = new String[]{"http","https","ftp"};
        Map<String,Integer> domains = new HashMap<>();
        Map<String,Integer> protocols = new HashMap<>();
        int count=0;

        while (matcher.find()){
            System.out.println("Url: " + matcher.group(0));
            count++;
            for (int i = 0; i < 14; i++) {
                if (matcher.group(i+8) != null){
                    if (domains.containsKey(domainNames[i])) {
                        domains.put(domainNames[i], domains.get(domainNames[i]) + 1);
                    } else {
                        domains.put(domainNames[i], 1);
                    }
                }
            }
            for (int i = 0; i < 3; i++) {
                if (matcher.group(i+2) != null){
                    if (protocols.containsKey(protocolNames[i])) {
                        protocols.put(protocolNames[i], protocols.get(protocolNames[i]) + 1);
                    } else {
                        protocols.put(protocolNames[i], 1);
                    }
                }
            }

        }

        System.out.println("Всего urls: " + count);
        System.out.println("Protocols: ");
        protocols.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
        System.out.println("Domains: ");
        domains.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);

        //Добавить топ протоколов
        //Добавить топ доменов
        //Добавить топ национальных доменов
    }
    //тут вывести топы
}


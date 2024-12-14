# Lottie 🎨

## Zakaj? 🤔
Lottie Android je knjižnica za animacije, ki omogoča preprosto integracijo in prikazovanje animacij v aplikacijah za Android. Knjižnica podpira **JSON animacije**, ustvarjene v orodju Adobe After Effects z Bodymovin pluginom. Primerna je za uporabo zaradi svoje **učinkovitosti**, preprostosti in široke podpore.

---

## Prednosti ✅
- **Preprosta uporaba** in integracija
- Podpira kompleksne animacije brez večjega vpliva na zmogljivost aplikacije
- Široka podpora animacijam ustvarjenim z Bodymovin
- Aktivna skupnost in veliko primerov uporabe

---

## Slabosti ❌
- Omejitve glede podpore specifičnih funkcionalnosti iz Adobe After Effects
- Možne težave s performansom pri zelo kompleksnih animacijah
- Potreba po skrbni optimizaciji JSON animacij za najboljšo uporabniško izkušnjo

---

## Licenca 📜
Lottie je na voljo pod **Apache 2.0 licenco**, kar omogoča uporabo tako za komercialne kot nekomercialne projekte. Več informacij o licenci najdete [tukaj](https://github.com/airbnb/lottie-android/blob/master/LICENSE).

---

## Število zvezdic, sledilcev, forkov ⭐
- **Stars:** TBD
- **Followers:** TBD
- **Forks:** TBD

---

## Vzdrževanje projekta 🔧
- **Zadnja posodobitev:** TBD
- **Commit aktivnost:** TBD
- **Število razvijalcev:** TBD

---

## Primeri uporabe 📂
### Preprost prikaz animacije
```kotlin
val lottieAnimationView = findViewById<LottieAnimationView>(R.id.animationView)
lottieAnimationView.setAnimation("animation.json")
lottieAnimationView.playAnimation()

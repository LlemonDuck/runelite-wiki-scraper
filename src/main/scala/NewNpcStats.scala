

case class NewNpcStats(
                     id: Int,
                     var name: String,
                     levelHp: Option[Int],
                     levelAttack: Option[Int],
                     levelStrength: Option[Int],
                     levelDefense: Option[Int],
                     levelMagic: Option[Int],
                     levelRanged: Option[Int],
                     attackBonus: Option[Int] = Some(0),
                     strengthBonus: Option[Int] = Some(0),
                     magicAccuracy: Option[Int] = Some(0),
                     magicDamage: Option[Int] = Some(0),
                     rangedAccuracy: Option[Int] = Some(0),
                     rangedStrength: Option[Int] = Some(0),
                     defenseStab: Option[Int] = Some(0),
                     defenseSlash: Option[Int] = Some(0),
                     defenseCrush: Option[Int] = Some(0),
                     defenseMagic: Option[Int] = Some(0),
                     defenseRanged: Option[Int] = Some(0),
                     combatLevel: Option[Int] = Some(0),
                     size: Option[Int] = Some(1),
                     isDemon: Option[Boolean] = Some(false),
                     isDragon: Option[Boolean] = Some(false),
                     isKalphite: Option[Boolean] = Some(false),
                     isLeafy: Option[Boolean] = Some(false),
                     isUndead: Option[Boolean] = Some(false),
                     isVampyre: Option[Boolean] = Some(false),
                     isXerician: Option[Boolean] = Some(false),
                   )
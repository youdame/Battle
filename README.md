# Battle 게임 제작

도라에몽 캐릭터를 이용한 Battle 게임<br/><객체지향프로그래밍> 수업에서 처음으로 자바를 배우고 만든 게임입니다. 


<시나리오 요약>

진구가 비실이, 퉁퉁이, 영민이(악당)와 싸운다.<br/>진구는 중간 중간 도라에몽의 도움을 받아 도라에몽의 도구를 무기로 사용할 수 있다.<br/> 이슬이에게 응원을 받으면 hp가 회복된다.<br/> 악당은 악당마다 hp와 power가 다르며 악당 3명 모두를 물리치면 진구가 이긴다.

​

__Player__

진구가 선공격을 하면 비실이, 퉁퉁이, 영민이가 바로 진구를 공격한다.<br/> hp를 모두 소모한 악당이 존재하면, 그 악당의 라벨은 까맣게 변한다.<br/> hp는 양수 값이므로, 공격을 당해 악당의 hp가 0보다 작아지면 자동으로 0으로 세팅했다.<br/> 악당들의 hp가 모두 0이 되면 진구가 이기게 된다.<br/>그 전에 진구의 hp가 0이 되면 상대팀이 이긴다.

​

가) 노진구

사용자가 조종할 수 있는 Player는 진구 하나이다. 진구에게는 선택지가 3가지이다.

①    도라에몽 도와줘

도라에몽의 도구 4가지 중 하나를 랜덤으로 획득한다.

②    공격하기

악당 3명 중 한 명을 골라 랜덤으로 공격한다.<br/> 초기에 무기를 가지고 있지 않기에 무기가 없을 땐 맨손(자신의 power)으로 싸운다.<br/> ‘도라에몽 도와줘’를 통해 무기를 획득하면 가지고 있는 무기 중 하나를 골라 공격한다.<br/> 공격 시 power는 자신의 power + 무기의 power 이다.


③    이슬이의 응원받기

이슬이에게 응원을 받으면, hp가 50 늘어난다.

​

나) 악당

악당은 스킬이 곧 공격이다.<br/> 진구에게 공격을 할 때 스킬이 사용되며, 그 스킬의 Power는 자신의 power와 동일하다.

게임 동영상이 보고싶다면? [클릭!](https://www.youtube.com/watch?v=WchMBdsapSA)

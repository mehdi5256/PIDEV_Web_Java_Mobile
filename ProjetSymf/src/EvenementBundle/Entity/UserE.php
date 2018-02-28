<?php

namespace EvenementBundle\Entity;

use Doctrine\ORM\Mapping as ORM;
use FOS\UserBundle\Model\User as BaseUser;


/**
 * UserE
 *
 * @ORM\Table(name="user")
 * @ORM\Entity(repositoryClass="EvenementBundle\Repository\UserERepository")
 */
class UserE extends BaseUser
{
    /**
     * @ORM\Id
     * @ORM\Column(type="integer")
     * @ORM\GeneratedValue(strategy="AUTO")
     */
    protected $id;

    /**
     * @var string
     *
     * @ORM\Column(name="nomU", type="string", length=255)
     */
    private $nomU;

    /**
     * @var string
     *
     * @ORM\Column(name="prenomU", type="string", length=255)
     */
    private $prenomU;

    /**
     * @var int
     *
     * @ORM\Column(name="ageU", type="integer")
     */
    private $ageU;

    /**
     *
     * @ORM\ManyToMany(targetEntity="Event", inversedBy="participants")
     * @ORM\JoinColumn(name="event_id")
     */
    private $events;


    /**
     * Get id
     *
     * @return int
     */
    public function getId()
    {
        return $this->id;
    }

    /**
     * Set nomU
     *
     * @param string $nomU
     *
     * @return UserE
     */
    public function setNomU($nomU)
    {
        $this->nomU = $nomU;

        return $this;
    }

    /**
     * Get nomU
     *
     * @return string
     */
    public function getNomU()
    {
        return $this->nomU;
    }

    /**
     * Set prenomU
     *
     * @param string $prenomU
     *
     * @return UserE
     */
    public function setPrenomU($prenomU)
    {
        $this->prenomU = $prenomU;

        return $this;
    }

    /**
     * Get prenomU
     *
     * @return string
     */
    public function getPrenomU()
    {
        return $this->prenomU;
    }

    /**
     * Set ageU
     *
     * @param integer $ageU
     *
     * @return UserE
     */
    public function setAgeU($ageU)
    {
        $this->ageU = $ageU;

        return $this;
    }

    /**
     * Get ageU
     *
     * @return int
     */
    public function getAgeU()
    {
        return $this->ageU;
    }

    /**
     * @param mixed $events
     */
    public function setEvents($events)
    {
        if (!is_array($events)) {
            $events = array($events);
        }
        $this->events = $events;
    }

    /**
     * @return mixed
     */
    public function getEvents()
    {
        return $this->events;
    }
    /**
     * Add event
     *
     * @param \tgnBundle\Entity\Event $event
     *
     * @return UserE
     */
    public function addEvent(\EvenementBundle\Entity\Event $event) {
        $this->events->add($event);
        return $this;
    }
    /**
     * Remove event
     *
     * @param \EvenementBundle\Entity\Event $event
     */
    public function removeEvent(\EvenementBundle\Entity\Event $event) {
        $this->events->removeElement($event);
    }
    public function __construct()
    {   $this->events = new \Doctrine\Common\Collections\ArrayCollection();
        parent::__construct();
        // your own logic
    }
}
